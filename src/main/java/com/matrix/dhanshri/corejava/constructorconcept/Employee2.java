package com.matrix.dhanshri.corejava.constructorconcept;

public class Employee2 {


    int empid;
    String empname;

    //Parameterized Constructor
    public Employee2(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public void getDetails() {
        System.out.println("Emp id is: " + empid);
        System.out.println("Emp name is: " + empname);
    }
}