package com.matrix.dhanashri.corejava.constructorconcept;

public class Employee1 {
    int empid;
    String empname;

    public Employee1(int empid, String empname){
        this.empid= empid;
        this.empname= empname;
    }

    public void getDetails(){
        System.out.println("Emp id is:   "    + empid);
        System.out.println("emp name is: "       + empname);
    }

    public static void main(String[] args) {
        Employee1 emp1= new Employee1(10, "Dhanu1");
        emp1.getDetails();
        Employee1 emp2= new Employee1(20, "Dhanu2");
        emp2.getDetails();


    }
}
