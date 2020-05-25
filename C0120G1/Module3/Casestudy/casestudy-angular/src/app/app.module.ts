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
    CustomerEditComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
    NgxPaginationModule,
    Ng2SearchPipeModule
  ],
  providers: [
    CustomerService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
