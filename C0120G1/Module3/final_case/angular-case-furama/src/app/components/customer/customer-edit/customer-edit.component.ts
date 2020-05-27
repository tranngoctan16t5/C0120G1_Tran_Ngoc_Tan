import {Component, OnInit, OnDestroy} from '@angular/core';
import {Customer} from '../../../models/customer.model';
import {CustomerService} from '../../../services/customer.service';
import {Router, ActivatedRoute, Params} from '@angular/router';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit, OnDestroy {
  public customer: Customer;
  public subscription: Subscription;
  public subscriptionParams: Subscription;

  constructor(
    public customerService: CustomerService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.customer = new Customer();
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.subscription = this.customerService.getOneCustomer(data.id).subscribe((customer: Customer) => {
        this.customer = customer;
      });
    });
  }

  onEditCustomer() {
    this.subscription = this.customerService.updateCustomer(this.customer).subscribe((data: Customer) => {
      this.routerService.navigateByUrl('customers');
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
