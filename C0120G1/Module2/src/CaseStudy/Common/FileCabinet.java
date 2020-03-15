package CaseStudy.Common;

import CaseStudy.Controller.MainController;
import CaseStudy.Model.Customer;
import CaseStudy.Model.Employee;
import CaseStudy.Model.Villa;

import java.util.ArrayList;
import java.util.Stack;

public class FileCabinet {
    public static Stack<Employee> addFileEmployment(){
        ArrayList<Employee> listEmployee;
        listEmployee = FuncReadFileCSV.getFileCSVToListEmployee();
        Stack<Employee> listFile = new Stack<Employee>();
        for (int i = 0; i <listEmployee.size(); i++) {
            listFile.push(listEmployee.get(i));
        }
        return listFile;

    }
}
