import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Service} from '../models/service.model';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  public API = 'http://localhost:3000/services';

  constructor(public http: HttpClient) {
  }

  getAllServices(): Observable<any> {
    return this.http.get(this.API);
  }

  addService(service: Service): Observable<any> {
    return this.http.post(this.API, service);
  }

  updateService(service: Service): Observable<any> {
    return this.http.put(`${this.API}/${service.id}`, service);
  }

  deleteService(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }

  getOneService(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }
}
