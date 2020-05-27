import {Component, OnInit, OnDestroy} from '@angular/core';
import {Contact} from '../../../models/contact.model';
import {ContactService} from '../../../services/contact.service';
import {Router, ActivatedRoute, Params} from '@angular/router';
import {Subscription} from 'rxjs';
import {Customer} from '../../../models/customer.model';
import {Employee} from '../../../models/employee.model';
import {Service} from '../../../models/service.model';
import {CustomerService} from '../../../services/customer.service';
import {EmployeeService} from '../../../services/employee.service';
import {ServiceService} from '../../../services/service.service';

@Component({
  selector: 'app-contact-edit',
  templateUrl: './contact-edit.component.html',
  styleUrls: ['./contact-edit.component.css']
})
export class ContactEditComponent implements OnInit, OnDestroy {
  public contact: Contact;
  public subscription: Subscription;
  public subscriptionParams: Subscription;
  public customers: Customer[] = [];
  public employees: Employee[] = [];
  public services: Service[] = [];

  constructor(
    public contactService: ContactService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute,
    public customerService: CustomerService,
    public employeeService: EmployeeService,
    public serviceService: ServiceService,
  ) {
  }

  ngOnInit() {
    this.contact = new Contact();
    this.loadData();
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

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.subscription = this.contactService.getOneContact(data.id).subscribe((contact: Contact) => {
        this.contact = contact;
      });
    });
  }

  onEditContact() {
    this.subscription = this.contactService.updateContact(this.contact).subscribe((data: Contact) => {
      this.routerService.navigateByUrl('contacts');
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
