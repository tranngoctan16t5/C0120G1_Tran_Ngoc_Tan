import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {ContactDetailService} from '../../../services/contact-detail.service';

@Component({
  selector: 'app-contact-detail-delete',
  templateUrl: './contact-detail-delete.component.html',
  styleUrls: ['./contact-detail-delete.component.css']
})
export class ContactDetailDeleteComponent implements OnInit {
  public contactDetailOfFullName;
  public contactDetailOfId;

  constructor(
    public dialogRef: MatDialogRef<ContactDetailDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public contactDetailService: ContactDetailService,
  ) {
  }

  ngOnInit(): void {
    this.contactDetailOfFullName = this.data.data1.fullName;
    this.contactDetailOfId = this.data.data1.id;
  }

  deleteContactDetail() {
    this.contactDetailService.deleteContactDetail(this.contactDetailOfId).subscribe(data => {
      this.dialogRef.close();
    });
  }
}
