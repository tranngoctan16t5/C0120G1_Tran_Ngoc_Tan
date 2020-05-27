import {Component, OnInit, OnDestroy} from '@angular/core';
import {Employee} from '../../../models/employee.model';
import {EmployeeService} from '../../../services/employee.service';
import {Router, ActivatedRoute, Params} from '@angular/router';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit, OnDestroy {
  public employee: Employee;
  public subscription: Subscription;
  public subscriptionParams: Subscription;

  constructor(
    public employeeService: EmployeeService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute
  ) {
  }

  ngOnInit() {
    this.employee = new Employee();
    this.loadData();
  }

  loadData() {
    this.subscriptionParams = this.activatedRouteService.params.subscribe((data: Params) => {
      this.subscription = this.employeeService.getOneEmployee(data.id).subscribe((employee: Employee) => {
        this.employee = employee;
      });
    });
  }

  onEditEmployee() {
    this.subscription = this.employeeService.updateEmployee(this.employee).subscribe((data: Employee) => {
      this.routerService.navigateByUrl('employees');
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
