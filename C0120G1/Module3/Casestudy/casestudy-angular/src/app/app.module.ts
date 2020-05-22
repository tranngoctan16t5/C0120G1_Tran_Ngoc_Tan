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
        path: ':id',
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
    CustomerEditComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    CustomerService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
