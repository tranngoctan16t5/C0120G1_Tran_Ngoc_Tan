import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AppComponent} from './app.component';
import {CustomersComponent} from './components/customer/customers/customers.component';
import {CustomerAddComponent} from './components/customer/customer-add/customer-add.component';
import {CustomerEditComponent} from './components/customer/customer-edit/customer-edit.component';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {HttpClientModule} from '@angular/common/http';
import {CustomerService} from './services/customer.service';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CustomerDeleteComponent} from './components/customer/customer-delete/customer-delete.component';
import {EmployeesComponent} from './components/employee/employees/employees.component';
import {EmployeeAddComponent} from './components/employee/employee-add/employee-add.component';
import {EmployeeListComponent} from './components/employee/employee-list/employee-list.component';
import {EmployeeDeleteComponent} from './components/employee/employee-delete/employee-delete.component';
import {EmployeeEditComponent} from './components/employee/employee-edit/employee-edit.component';
import {EmployeeService} from './services/employee.service';
import {
  MAT_DATE_LOCALE,
  MatButtonModule,
  MatDatepickerModule,
  MatDialogModule,
  MatFormFieldModule,
  MatInputModule,
  MatNativeDateModule
} from '@angular/material';
import {ServiceAddComponent} from './components/service/service-add/service-add.component';
import {ServiceDeleteComponent} from './components/service/service-delete/service-delete.component';
import {ServiceEditComponent} from './components/service/service-edit/service-edit.component';
import {ServiceListComponent} from './components/service/service-list/service-list.component';
import {ServicesComponent} from './components/service/services/services.component';
import {ServiceService} from './services/service.service';
import {ContactAddComponent} from './components/contact/contact-add/contact-add.component';
import {ContactDeleteComponent} from './components/contact/contact-delete/contact-delete.component';
import {ContactEditComponent} from './components/contact/contact-edit/contact-edit.component';
import {ContactListComponent} from './components/contact/contact-list/contact-list.component';
import {ContactsComponent} from './components/contact/contacts/contacts.component';
import {ContactService} from './services/contact.service';
import {ContactDetailAddComponent} from './components/contact-detail/contact-detail-add/contact-detail-add.component';
import {ContactDetailDeleteComponent} from './components/contact-detail/contact-detail-delete/contact-detail-delete.component';
import {ContactDetailEditComponent} from './components/contact-detail/contact-detail-edit/contact-detail-edit.component';
import {ContactDetailListComponent} from './components/contact-detail/contact-detail-list/contact-detail-list.component';
import {ContactDetailsComponent} from './components/contact-detail/contact-details/contact-details.component';
import {ContactDetailService} from './services/contact-detail.service';


const appRoutes: Routes = [

  {
    path: 'customers',
    component: CustomersComponent,
    children: [
      {
        path: '',
        component: CustomerListComponent
      },
      {
        path: ':id/edit',
        component: CustomerEditComponent
      },
      {
        path: 'add',
        component: CustomerAddComponent

      }
    ]
  },
  {
    path: 'employees',
    component: EmployeesComponent,
    children: [
      {
        path: '',
        component: EmployeeListComponent
      },
      {
        path: ':id/edit',
        component: EmployeeEditComponent
      },
      {
        path: 'add',
        component: EmployeeAddComponent
      }
    ]
  },
  {
    path: 'services',
    component: ServicesComponent,
    children: [
      {
        path: '',
        component: ServiceListComponent
      },
      {
        path: ':id/edit',
        component: ServiceEditComponent
      },
      {
        path: 'add',
        component: ServiceAddComponent
      }
    ]
  },
  {
    path: 'contacts',
    component: ContactsComponent,
    children: [
      {
        path: '',
        component: ContactListComponent
      },
      {
        path: ':id/edit',
        component: ContactEditComponent
      },
      {
        path: 'add',
        component: ContactAddComponent
      }
    ]
  },
  {
    path: 'contact-details',
    component: ContactDetailsComponent,
    children: [
      {
        path: '',
        component: ContactDetailListComponent
      },
      {
        path: ':id/edit',
        component: ContactDetailEditComponent
      },
      {
        path: 'add',
        component: ContactDetailAddComponent
      }
    ]
  }
];

@NgModule({
  declarations: [
    AppComponent,
    CustomersComponent,
    CustomerAddComponent,
    CustomerEditComponent,
    CustomerListComponent,
    CustomerDeleteComponent,
    EmployeesComponent,
    EmployeeAddComponent,
    EmployeeListComponent,
    EmployeeDeleteComponent,
    EmployeeEditComponent,
    ServiceAddComponent,
    ServiceDeleteComponent,
    ServiceEditComponent,
    ServiceListComponent,
    ServicesComponent,
    ContactAddComponent,
    ContactDeleteComponent,
    ContactEditComponent,
    ContactListComponent,
    ContactsComponent,
    ContactDetailAddComponent,
    ContactDetailDeleteComponent,
    ContactDetailEditComponent,
    ContactDetailListComponent,
    ContactDetailsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
    NgxPaginationModule,
    Ng2SearchPipeModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    MatButtonModule,
    MatDialogModule
  ],
  providers: [
    CustomerService, EmployeeService, ServiceService, ContactService, ContactDetailService, {provide: MAT_DATE_LOCALE, useValue: 'en-GB'}
  ],
  bootstrap: [AppComponent],
  entryComponents: [
    CustomerDeleteComponent,
    EmployeeDeleteComponent,
    ServiceDeleteComponent,
    ContactDeleteComponent,
    ContactDetailDeleteComponent
  ]


})
export class AppModule {
}
