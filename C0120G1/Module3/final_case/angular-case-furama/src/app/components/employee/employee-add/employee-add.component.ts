import {Component, OnInit, OnDestroy} from '@angular/core';
import {Employee} from '../../../models/employee.model';
import {Subscription} from 'rxjs';
import {Router} from '@angular/router';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import {EmployeeService} from '../../../services/employee.service';


@Component({
  selector: 'app-customer-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit, OnDestroy {
  public employee: Employee;
  public subscription: Subscription;
  public frmEmployee: FormGroup;


  constructor(
    public employeeService: EmployeeService,
    public routerService: Router,
    public formBuilder: FormBuilder,
  ) {
  }

  ngOnInit() {
    this.employee = new Employee();
    this.createForm();
  }

  createForm() {
    this.frmEmployee = this.formBuilder.group({
      code: ['', [Validators.required, Validators.pattern('NV-([0-9]{4})')]],
      name: ['', Validators.required],
      vitri: [''],
      trinhdo: [''],
      bophan: [''],
      birthday: [''],
      idcard: ['', [Validators.pattern('\\d{9}'), Validators.required]],
      luong: [''],
      phone: ['', [Validators.required, Validators.pattern('(^090[0-9]{7})|(091[0-9]{7})|(\\(84\\)\\+90[0-9]{7})|\\(84\\)\\+91[0-9]{7}')]],
      email: [''],
      addresss: [''],


    });
    this.frmEmployee.valueChanges.subscribe(data => {
      console.log(data);
    });
  }


  onAddEmployee() {
    this.subscription = this.employeeService.addEmployee(this.employee).subscribe(data => {
      if (data && data.id) {
        this.routerService.navigate(['employees']);
      }
    });
  }

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

  onSubmitForm() {
    console.log(this.frmEmployee);
  }

}
