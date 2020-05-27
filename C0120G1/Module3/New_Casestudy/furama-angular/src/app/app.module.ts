import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AppComponent} from './app.component';
import {CustomersComponent} from './components/customers/customers.component';
import {CustomerListComponent} from './components/customer-list/customer-list.component';
import {CustomerAddComponent} from './components/customer-add/customer-add.component';
import {HomeComponent} from './components/home/home.component';
import {CustomerEditComponent} from './components/customer-edit/customer-edit.component';
import {CustomerService} from './services/customer.service';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {ReactiveFormsModule} from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CustomerDeleteComponent} from './components/customer-delete/customer-delete.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatNativeDateModule} from '@angular/material/core';


const appRoutes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
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
  }
];

@NgModule({
  declarations: [
    AppComponent,
    CustomersComponent,
    CustomerListComponent,
    CustomerAddComponent,
    HomeComponent,
    CustomerEditComponent,
    CustomerDeleteComponent,

  ],
  imports: [
    BrowserModule,
    RouterModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
    NgxPaginationModule,
    Ng2SearchPipeModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatNativeDateModule
  ],

  providers: [
    CustomerService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
