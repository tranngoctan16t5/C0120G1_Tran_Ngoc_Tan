import {Component, OnInit, OnDestroy} from '@angular/core';
import {CustomerService} from '../../services/customer.service';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;

  constructor(public customerService: CustomerService) {
  }

  ngOnInit() {
    this.subscription = this.customerService.getAllCustomers().subscribe(data => {

    });
  }
  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }
}
