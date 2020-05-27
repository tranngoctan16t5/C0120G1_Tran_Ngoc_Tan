import {Component, OnInit, OnDestroy} from '@angular/core';
import {Service} from '../../../models/service.model';
import {Subscription} from 'rxjs';
import {ServiceService} from '../../../services/service.service';
import {Router} from '@angular/router';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';


@Component({
  selector: 'app-service-add',
  templateUrl: './service-add.component.html',
  styleUrls: ['./service-add.component.css']
})
export class ServiceAddComponent implements OnInit, OnDestroy {
  public service: Service;
  public subscription: Subscription;
  public frmService: FormGroup;


  constructor(
    public serviceService: ServiceService,
    public routerService: Router,
    public formBuilder: FormBuilder,
  ) {
  }

  ngOnInit() {
    this.service = new Service();
    this.createForm();
  }

  createForm() {
    this.frmService = this.formBuilder.group({
      name: ['', Validators.required],
      code: ['', [Validators.required, Validators.pattern('DV-([0-9]{4})')]],
      area: [''],
      floor: [''],
      numbermaxpeople: [''],
      rentcost: [''],
      renttype: [''],
      status: [''],
    });
    this.frmService.valueChanges.subscribe(data => {
      console.log(data);
    });
  }


  onAddService() {
    this.subscription = this.serviceService.addService(this.service).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['services']);
      }
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

  onSubmitForm() {
    console.log(this.frmService);
  }

}
