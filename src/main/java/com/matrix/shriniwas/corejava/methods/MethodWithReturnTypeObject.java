package com.matrix.shriniwas.corejava.methods;

public class MethodWithReturnTypeObject {

    public Employee getEmployeeDetails() {
        Employee emp = new Employee();
        return emp;
    }

    public static void main(String[] args) {
        MethodWithReturnTypeObject obj = new MethodWithReturnTypeObject();
        Employee emp = obj.getEmployeeDetails();
        System.out.println(emp.name + " ---- " + emp.empId + " ---- " + emp.company);
    }
}
