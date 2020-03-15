package Bai_Tap_Tren_Mang.anhKien.Models;

import Bai_Tap_Tren_Mang.anhKien.Models.Person;

public  class Employee extends Person {
    private double salary;

    public Employee() {
    }

    public  Employee(int id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
