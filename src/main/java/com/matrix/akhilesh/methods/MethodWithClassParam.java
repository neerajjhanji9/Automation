package com.matrix.akhilesh.methods;

public class MethodWithClassParam {

    public static void main(String[] args) {
        MethodWithClassParam obj = new MethodWithClassParam();
        obj.m2();
    }

    public void m2(){
        Employee emp = new Employee();
        System.out.println(emp.empId);
        System.out.println(emp.str);
    }
}
