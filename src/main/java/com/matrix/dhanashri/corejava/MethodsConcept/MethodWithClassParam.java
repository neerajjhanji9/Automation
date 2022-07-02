package com.matrix.dhanashri.corejava.MethodsConcept;

import com.matrix.dhanashri.corejava.Employee;

public class MethodWithClassParam {
    public void getInfo(){
        Employee emp= new Employee();
        System.out.println(emp.name);
        System.out.println(emp.EmpId);
        System.out.println(emp.Company);
    }

    public static void main(String[] args) {
        MethodWithClassParam mp= new MethodWithClassParam();
        mp.getInfo();

    }
}
