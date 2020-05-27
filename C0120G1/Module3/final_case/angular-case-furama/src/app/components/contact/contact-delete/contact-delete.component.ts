import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {ContactService} from '../../../services/contact.service';

@Component({
  selector: 'app-contact-delete',
  templateUrl: './contact-delete.component.html',
  styleUrls: ['./contact-delete.component.css']
})
export class ContactDeleteComponent implements OnInit {
  public contactOfFullName;
  public contactOfId;

  constructor(
    public dialogRef: MatDialogRef<ContactDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public contactService: ContactService,
  ) {
  }

  ngOnInit(): void {
    this.contactOfFullName = this.data.data1.fullName;
    this.contactOfId = this.data.data1.id;
  }

  deleteContact() {
    this.contactService.deleteContact(this.contactOfId).subscribe(data => {
      this.dialogRef.close();
    });
  }
}
