import {Component, OnInit, OnDestroy} from '@angular/core';
import {Observable, Subscription} from 'rxjs';
import {Employee} from '../../../models/employee.model';
import {MatDialog} from '@angular/material';
import {EmployeesComponent} from '../employees/employees.component';
import {EmployeeService} from '../../../services/employee.service';
import {EmployeeDeleteComponent} from '../employee-delete/employee-delete.component';


@Component({
  selector: 'app-customer-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit, OnDestroy {
  public subscription: Subscription;
  public employees: Employee[] = [];
  public totalRec: number;
  public page = 1;
  public searchText;

  constructor(public employeeService: EmployeeService,  public dialog: MatDialog) {
  }

  ngOnInit() {
     this.employeeService.getAllEmployees().subscribe((data) => {
      this.employees = data;
      this.totalRec = this.employees.length;
      console.log(this.totalRec);
      console.log(this.page);
    });
  }


  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }


  onDeleteCustomer(id: number) {
    if (confirm('xoa hay khong xoa noi 1 loi thoi???') === true) {
      this.subscription = this.employeeService.deleteEmployee(id).subscribe((data: Employee) => {
        this.ngOnInit();
      });
    }

  }

  updateDataAfterDelete(id: number) {
    for (let i = 0; i < this.employees.length; i++) {
      if (this.employees[i].id === id) {
        this.employees.splice(i, 1);
        break;
      }
    }
  }
  openDialog(employeeId): void {
    this.employeeService.getOneEmployee(employeeId).subscribe(dataOfEmployee => {
      const dialogRef = this.dialog.open(EmployeeDeleteComponent, {
        width: '500px',
        height: '230px',
        data: {data1: dataOfEmployee},
        disableClose: true,
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }

}
