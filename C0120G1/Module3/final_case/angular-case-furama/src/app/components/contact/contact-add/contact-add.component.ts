import {Component, OnInit, OnDestroy} from '@angular/core';
import {Contact} from '../../../models/contact.model';
import {Subscription} from 'rxjs';
import {ContactService} from '../../../services/contact.service';
import {Router} from '@angular/router';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import {CustomerService} from '../../../services/customer.service';
import {Customer} from '../../../models/customer.model';
import {Employee} from '../../../models/employee.model';
import {EmployeeService} from '../../../services/employee.service';
import {Service} from '../../../models/service.model';
import {ServiceService} from '../../../services/service.service';


@Component({
  selector: 'app-contact-add',
  templateUrl: './contact-add.component.html',
  styleUrls: ['./contact-add.component.css']
})
export class ContactAddComponent implements OnInit, OnDestroy {
  public contact: Contact;
  public subscription: Subscription;
  public frmContact: FormGroup;
  public customers: Customer[] = [];
  public employees: Employee[] = [];
  public services: Service[] = [];


  constructor(
    public contactService: ContactService,
    public routerService: Router,
    public formBuilder: FormBuilder,
    public customerService: CustomerService,
    public employeeService: EmployeeService,
    public serviceService: ServiceService,
  ) {
  }

  ngOnInit() {
    this.contact = new Contact();
    this.createForm();
    this.customerService.getAllCustomers().subscribe((data: Customer[]) => {
      this.customers = data;
    });
    this.employeeService.getAllEmployees().subscribe((data: Employee[]) => {
      this.employees = data;
    });
    this.serviceService.getAllServices().subscribe((data: Service[]) => {
      this.services = data;
    });
  }

  createForm() {
    this.frmContact = this.formBuilder.group({
      customer: [''],
      employee: [''],
      service: [''],
      datecreate: [''],
      datelast: [''],
      money: [''],
      totalcost: ['']
    });
    this.frmContact.valueChanges.subscribe(data => {
      console.log(data);
    });
  }


  onAddContact() {
    this.subscription = this.contactService.addContact(this.contact).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['contacts']);
      }
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

  onSubmitForm() {
    console.log(this.frmContact);
  }

}
