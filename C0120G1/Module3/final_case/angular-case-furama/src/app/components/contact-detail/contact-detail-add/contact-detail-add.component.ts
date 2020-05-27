import {Component, OnInit, OnDestroy} from '@angular/core';
import {ContactDetail} from '../../../models/contact-detail.model';
import {Subscription} from 'rxjs';
import {ContactDetailService} from '../../../services/contact-detail.service';
import {Router} from '@angular/router';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import {ContactService} from '../../../services/contact.service';
import {Contact} from '../../../models/contact.model';
import {Service} from '../../../models/service.model';


@Component({
  selector: 'app-contact-detail-add',
  templateUrl: './contact-detail-add.component.html',
  styleUrls: ['./contact-detail-add.component.css']
})
export class ContactDetailAddComponent implements OnInit, OnDestroy {
  public contactDetail: ContactDetail;
  public subscription: Subscription;
  public frmContactDetail: FormGroup;
  public contacts: Contact[] = [];


  constructor(
    public contactDetailService: ContactDetailService,
    public routerService: Router,
    public formBuilder: FormBuilder,
    public contactService: ContactService
  ) {
  }

  ngOnInit() {
    this.contactDetail = new ContactDetail();
    this.createForm();
    this.contactService.getAllContacts().subscribe((data: Contact[]) => {
      this.contacts = data;
    });
  }

  createForm() {
    this.frmContactDetail = this.formBuilder.group({
      idContact: [''],
      serviceBonus: [''],
      amount: ['']
    });
    this.frmContactDetail.valueChanges.subscribe(data => {
      console.log(data);
    });
  }


  onAddContactDetail() {
    this.subscription = this.contactDetailService.addContactDetail(this.contactDetail).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['contact-details']);
      }
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

  onSubmitForm() {
    console.log(this.frmContactDetail);
  }

}
