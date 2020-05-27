import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../models/employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API = 'http://localhost:3000/employees';

  constructor(public http: HttpClient) {
  }

  getAllEmployees(): Observable<any> {
    return this.http.get(this.API);
  }

  addEmployee(employee: Employee): Observable<any> {
    return this.http.post(this.API, employee);
  }

  updateEmployee(employee: Employee): Observable<any> {
    return this.http.put(`${this.API}/${employee.id}`, employee);
  }

  deleteEmployee(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }

  getOneEmployee(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }
}
