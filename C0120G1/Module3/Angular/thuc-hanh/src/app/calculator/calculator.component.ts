import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  output: number ;
  first: number;
  second =0;
  operator = '+';

  onFirstChange(value) {
    this.first = Number(value);
    this.calculator();

  }

  onSecondChange(value) {
    this.second = Number(value);
    this.calculator();
  }

  onSelectChange(value) {
    this.operator = value;
    this.calculator();
  }
calculator(){
  switch (this.operator) {
    case '+':
      this.output = this.first + this.second;
      break;
    case '-':
      this.output = this.first - this.second;
      break;
    case '*':
      this.output = this.first * this.second;
      break;
    case '/':
      this.output = this.first / this.second;
      break;
  }
}



  constructor() {
  }

  ngOnInit() {
  }


}
