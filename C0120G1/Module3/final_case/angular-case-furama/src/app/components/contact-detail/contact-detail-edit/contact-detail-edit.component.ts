import {Component, OnInit, OnDestroy} from '@angular/core';
import {ContactDetail} from '../../../models/contact-detail.model';
import {ContactDetailService} from '../../../services/contact-detail.service';
import {Router, ActivatedRoute, Params} from '@angular/router';
import {Subscription} from 'rxjs';
import {Service} from '../../../models/service.model';
import {Contact} from '../../../models/contact.model';
import {ContactService} from '../../../services/contact.service';

@Component({
  selector: 'app-contact-detail-edit',
  templateUrl: './contact-detail-edit.component.html',
  styleUrls: ['./contact-detail-edit.component.css']
})
export class ContactDetailEditComponent implements OnInit, OnDestroy {
  public contactDetail: ContactDetail;
  public subscription: Subscription;
  public subscriptionParams: Subscription;
  public contacts: Contact[] = [];

  constructor(
    public contactDetailService: ContactDetailService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute,
    public contactService: ContactService
  ) {
  }

  ngOnInit() {
    this.contactDetail = new ContactDetail();
    this.loadData();
    this.contactService.getAllContacts().subscribe((data: Contact[]) => {
      this.contacts = data;
    });
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.subscription = this.contactDetailService.getOneContactDetail(data.id).subscribe((contactDetail: ContactDetail) => {
        this.contactDetail = contactDetail;
      });
    });
  }

  onEditContactDetail() {
    this.subscription = this.contactDetailService.updateContactDetail(this.contactDetail).subscribe((data: ContactDetail) => {
      this.routerService.navigateByUrl('contact-details');
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
    if (this.subscriptionParams) {
      this.subscriptionParams.unsubscribe();
    }

  }

}
