import {Component, OnInit, OnDestroy} from '@angular/core';
import {CustomerService} from '../../services/customer.service';
import {Observable, Subscription} from 'rxjs';
import {Customer} from '../../models/customer.model';


@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public customers: Customer[] = [];
  public totalRec: number;
  public page = 1;
  public searchText;

  constructor(public customerService: CustomerService) {
  }

  ngOnInit() {
    this.subscription = this.customerService.getAllCustomers().subscribe((data: Customer[]) => {
      this.customers = data;
      this.totalRec = this.customers.length;
      console.log(this.totalRec);
      console.log(this.page);
    });
  }


  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteCustomer(id: number) {
    if (confirm('xoa hay khong xoa noi 1 loi thoi???') === true) {
      this.subscription = this.customerService.deleteCustomer(id).subscribe((data: Customer) => {
        this.ngOnInit();
      });
    }

  }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.customers.length; i++) {
      if (this.customers[i].id === id) {
        this.customers.splice(i, 1);
        break;
      }
    }
  }
}
