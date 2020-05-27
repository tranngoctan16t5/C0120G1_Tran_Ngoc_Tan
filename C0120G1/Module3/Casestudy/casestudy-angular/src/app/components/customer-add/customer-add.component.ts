import {Component, OnInit, OnDestroy} from '@angular/core';
import {Customer} from '../../models/customer.model';
import {Subscription} from 'rxjs';
import {CustomerService} from '../../services/customer.service';
import {Router} from '@angular/router';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';






@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit, OnDestroy {
  public customer: Customer;
  public subscription: Subscription;
  public frmCustomer: FormGroup;


  constructor(
    public customerService: CustomerService,
    public routerService: Router,
    public formBuilder: FormBuilder
  ) {
  }

  ngOnInit() {
    this.customer = new Customer();
    this.createForm();
  }

  createForm() {
    this.frmCustomer = this.formBuilder.group({
      MKH: ['', [
        Validators.required,
        Validators.pattern('KH-([0-9]{4})')
      ]],
      name: ['', Validators.required]

    });
    this.frmCustomer.valueChanges.subscribe(data => {
      console.log(data);
    });
  }


  onAddCustomer() {
    this.subscription = this.customerService.addCustomer(this.customer).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['customers']);
      }
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

  onSubmitForm() {
    console.log(this.frmCustomer);
  }
}
