import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Customer} from '../models/customer.model';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API = 'http://localhost:3000/customers';

  constructor(public http: HttpClient) {
  }

  getAllCustomers(): Observable<any> {
    return this.http.get(this.API);
  }

  addCustomer(customer: Customer): Observable<any> {
    return this.http.post(this.API, customer);
  }

  updateCustomer(customer: Customer): Observable<any> {
    return this.http.put(`${this.API}/${customer.id}`, customer);
  }

  deleteCustomer(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }

  getOneCustomer(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }
}
