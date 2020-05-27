import {Component, OnInit, OnDestroy} from '@angular/core';
import {Service} from '../../../models/service.model';
import {ServiceService} from '../../../services/service.service';
import {Router, ActivatedRoute, Params} from '@angular/router';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-service-edit',
  templateUrl: './service-edit.component.html',
  styleUrls: ['./service-edit.component.css']
})
export class ServiceEditComponent implements OnInit, OnDestroy {
  public service: Service;
  public subscription: Subscription;
  public subscriptionParams: Subscription;

  constructor(
    public serviceService: ServiceService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.service = new Service();
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.subscription = this.serviceService.getOneService(data.id).subscribe((service: Service) => {
        this.service = service;
      });
    });
  }

  onEditService() {
    this.subscription = this.serviceService.updateService(this.service).subscribe((data: Service) => {
      this.routerService.navigateByUrl('services');
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
    if (this.subscriptionParams) {
      this.subscriptionParams.unsubscribe();
    }

  }

}
