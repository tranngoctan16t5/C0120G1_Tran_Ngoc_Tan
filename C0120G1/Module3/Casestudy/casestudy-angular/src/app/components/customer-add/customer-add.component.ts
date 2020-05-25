import {Component, OnInit, OnDestroy} from '@angular/core';
import {Customer} from '../../models/customer.model';
import {Subscription} from 'rxjs';
import {CustomerService} from '../../services/customer.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit, OnDestroy {
  public customer: Customer;
  public subscription: Subscription;

  constructor(
    public customerService: CustomerService,
    public routerService: Router
  ) {
  }

  ngOnInit() {
    this.customer = new Customer();
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
}
