import {Component, OnInit, OnDestroy} from '@angular/core';
import {CustomerService} from '../../../services/customer.service';
import {Observable, Subscription} from 'rxjs';
import {Customer} from '../../../models/customer.model';
import {MatDialog} from '@angular/material';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';



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

  constructor(public customerService: CustomerService,  public dialog: MatDialog) {
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
  openDialog(customerId): void {
    this.customerService.getOneCustomer(customerId).subscribe(dataOfCustomer => {
      const dialogRef = this.dialog.open(CustomerDeleteComponent, {
        width: '500px',
        height: '230px',
        data: {data1: dataOfCustomer},
        disableClose: true,
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }

}
