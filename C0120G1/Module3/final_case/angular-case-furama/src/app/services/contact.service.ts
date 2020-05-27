import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Contact} from '../models/contact.model';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContactService {
  public API = 'http://localhost:3000/contacts';

  constructor(public http: HttpClient) {
  }

  getAllContacts(): Observable<any> {
    return this.http.get(this.API);
  }

  addContact(contact: Contact): Observable<any> {
    return this.http.post(this.API, contact);
  }

  updateContact(contact: Contact): Observable<any> {
    return this.http.put(`${this.API}/${contact.id}`, contact);
  }

  deleteContact(id: number): Observable<any> {
    return this.http.delete(`${this.API}/${id}`);
  }

  getOneContact(id: number): Observable<any> {
    return this.http.get(`${this.API}/${id}`);
  }
}
