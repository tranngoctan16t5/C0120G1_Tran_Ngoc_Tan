import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ContactDetail} from '../models/contact-detail.model';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContactDetailService {
  public API = 'http://localhost:3000/contact-details';

  constructor(public http: HttpClient) {
  }

  getAllContactDetails(): Observable<any> {
    return this.http.get(this.API);
  }

  addContactDetail(contactDetail: ContactDetail): Observable<any> {
    return this.http.post(this.API, contactDetail);
  }

  updateContactDetail(contactDetail: ContactDetail): Observable<any> {
    return this.http.put(`${this.API}/${contactDetail.id}`, contactDetail);
  }

  deleteContactDetail(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }

  getOneContactDetail(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }
}
