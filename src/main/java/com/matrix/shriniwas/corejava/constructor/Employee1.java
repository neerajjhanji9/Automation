package com.matrix.shriniwas.corejava.constructor;

public class Employee1 {

    int empId;
    String empName;

    // Parameterized Constructor
    public Employee1(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Id:" + empId);
        System.out.println("Employee Name:" + empName);
    }
}
