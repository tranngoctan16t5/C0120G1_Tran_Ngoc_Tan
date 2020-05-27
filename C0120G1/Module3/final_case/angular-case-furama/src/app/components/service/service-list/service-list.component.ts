import {Component, OnInit, OnDestroy} from '@angular/core';
import {ServiceService} from '../../../services/service.service';
import {Observable, Subscription} from 'rxjs';
import {Service} from '../../../models/service.model';
import {MatDialog} from '@angular/material';
import {ServiceDeleteComponent} from '../service-delete/service-delete.component';



@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public services: Service[] = [];
  public totalRec: number;
  public page = 1;
  public searchText;

  constructor(public serviceService: ServiceService,  public dialog: MatDialog) {
  }

  ngOnInit() {
    this.subscription = this.serviceService.getAllServices().subscribe((data: Service[]) => {
      this.services = data;
      this.totalRec = this.services.length;
      console.log(this.totalRec);
      console.log(this.page);
    });
  }


  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteService(id: number) {
    if (confirm('xoa hay khong xoa noi 1 loi thoi???') === true) {
      this.subscription = this.serviceService.deleteService(id).subscribe((data: Service) => {
        this.ngOnInit();
      });
    }

  }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.services.length; i++) {
      if (this.services[i].id === id) {
        this.services.splice(i, 1);
        break;
      }
    }
  }
  openDialog(serviceId): void {
    this.serviceService.getOneService(serviceId).subscribe(dataOfService => {
      const dialogRef = this.dialog.open(ServiceDeleteComponent, {
        width: '500px',
        height: '230px',
        data: {data1: dataOfService},
        disableClose: true,
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }

}
