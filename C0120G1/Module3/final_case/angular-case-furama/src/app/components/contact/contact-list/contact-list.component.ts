import {Component, OnInit, OnDestroy} from '@angular/core';
import {ContactService} from '../../../services/contact.service';
import {Observable, Subscription} from 'rxjs';
import {Contact} from '../../../models/contact.model';
import {MatDialog} from '@angular/material';
import {ContactDeleteComponent} from '../contact-delete/contact-delete.component';


@Component({
  selector: 'app-contact-list',
  templateUrl: './contact-list.component.html',
  styleUrls: ['./contact-list.component.css']
})
export class ContactListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public contacts: Contact[] = [];
  public totalRec: number;
  public page = 1;
  public searchText;
  public totalMoneyOfContact = 0;

  constructor(public contactService: ContactService, public dialog: MatDialog) {
  }

  ngOnInit() {
    this.subscription = this.contactService.getAllContacts().subscribe((data: Contact[]) => {
      this.contacts = data;
      this.totalRec = this.contacts.length;
      console.log(this.totalRec);
      console.log(this.page);
      for (let i = 0; i < this.contacts.length; i++) {
        this.totalMoneyOfContact = this.totalMoneyOfContact + (this.contacts[i].totalCost);
      }

    });
  }


  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteContact(id: number) {
    if (confirm('xoa hay khong xoa noi 1 loi thoi???') === true) {
      this.subscription = this.contactService.deleteContact(id).subscribe((data: Contact) => {
        this.ngOnInit();
      });
    }

  }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.contacts.length; i++) {
      if (this.contacts[i].id === id) {
        this.contacts.splice(i, 1);
        break;
      }
    }
  }

  openDialog(contactId): void {
    this.contactService.getOneContact(contactId).subscribe(dataOfContact => {
      const dialogRef = this.dialog.open(ContactDeleteComponent, {
        width: '500px',
        height: '230px',
        data: {data1: dataOfContact},
        disableClose: true,
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }

}
