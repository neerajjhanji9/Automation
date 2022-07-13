package com.matrix.akhilesh.constructor;

public class Employee {

    int emp_id;
    String str;

    public static void main(String[] args) {
        Employee ct = new Employee(45, "Akhil");
        ct.getEmpDetails();
    }

    public Employee(int emp_id, String str) {
        this.emp_id = emp_id;
        this.str = str;
    }

    public void getEmpDetails() {
        System.out.println(emp_id);
        System.out.println(str);
    }
}
