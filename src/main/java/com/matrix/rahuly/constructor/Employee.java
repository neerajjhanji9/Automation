package com.matrix.rahuly.constructor;

public class Employee {

    int empId;
    String name;

    public Employee(int emp, String nm){
        this.empId = emp;
        this.name = nm;
        System.out.println(empId);
        System.out.println(name);
    }

    public void employeeDetails() {
        System.out.println("Rahul Id:" + empId);
        System.out.println("Rahul Id2:" + name);
    }

    public static void main(String[] args) {
        Employee e = new Employee(5, "Rahul");
        e.employeeDetails();
    }

}
