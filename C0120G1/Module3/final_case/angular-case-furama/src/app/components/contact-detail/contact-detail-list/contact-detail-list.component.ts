import {Component, OnInit, OnDestroy} from '@angular/core';
import {ContactDetail} from '../../../models/contact-detail.model';
import {Observable, Subscription} from 'rxjs';
import {MatDialog} from '@angular/material';
import {ContactDetailDeleteComponent} from '../contact-detail-delete/contact-detail-delete.component';
import {ContactDetailService} from '../../../services/contact-detail.service';


@Component({
  selector: 'app-contact-detail-list',
  templateUrl: './contact-detail-list.component.html',
  styleUrls: ['./contact-detail-list.component.css']
})
export class ContactDetailListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public contactDetails: ContactDetail[] = [];
  public totalRec: number;
  public page = 1;
  public searchText;

  constructor(public contactDetailService: ContactDetailService,  public dialog: MatDialog) {
  }

  ngOnInit() {
    this.subscription = this.contactDetailService.getAllContactDetails().subscribe((data: ContactDetail[]) => {
      this.contactDetails = data;
      this.totalRec = this.contactDetails.length;
      console.log(this.totalRec);
      console.log(this.page);
    });
  }


  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  // onDeleteCustomer(id: number) {
  //   if (confirm('xoa hay khong xoa noi 1 loi thoi???') === true) {
  //     this.subscription = this.contactDetailService.deleteCustomer(id).subscribe((data: Customer) => {
  //       this.ngOnInit();
  //     });
  //   }
  //
  // }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.contactDetails.length; i++) {
      if (this.contactDetails[i].id === id) {
        this.contactDetails.splice(i, 1);
        break;
      }
    }
  }
  openDialog(contactDetailId): void {
    this.contactDetailService.getOneContactDetail(contactDetailId).subscribe(dataOfContactDetail => {
      const dialogRef = this.dialog.open(ContactDetailDeleteComponent, {
        width: '500px',
        height: '230px',
        data: {data1: dataOfContactDetail},
        disableClose: true,
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }

}
