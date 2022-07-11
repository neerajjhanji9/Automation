package com.matrix.ajaykumar.corejava.methods;

public class MethodWithClassParameter {

    public void getData(Employee emp){
        System.out.println(emp.name);
        System.out.println(emp.empId);
        System.out.println(emp.company);



    }
    public static void main(String[] args) {

        Employee obj1 = new Employee();
        Employee obj2 = new Employee();

        MethodWithClassParameter o = new MethodWithClassParameter();
        o.getData(obj1);


    }
}
