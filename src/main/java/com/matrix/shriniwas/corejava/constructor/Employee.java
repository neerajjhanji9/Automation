package com.matrix.shriniwas.corejava.constructor;

public class Employee {

    int empId;
    String empName;

    // Parameterized Constructor
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Id:" + empId);
        System.out.println("Employee Name:" + empName);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Shri1");
        emp1.getEmployeeDetails();
        Employee emp2 = new Employee(200, "Shri2");
        emp2.getEmployeeDetails();
    }
}
