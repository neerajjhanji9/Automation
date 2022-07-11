package com.matrix.mohita.constructors;

public class Employee {

    int empId ;
    String name;

    public Employee(int id,String nm){   // parameterized constructor
        empId = id;
        name = nm;
    }
    public void getDetails(){
        System.out.println(empId);
        System.out.println(name);
    }
    public Employee(){
        System.out.println("Hello, no args constructor");     // no args constructor
    }

    public static void main(String[] args) {
        Employee obj1 = new Employee(101,"dino");
        obj1.getDetails();
        Employee obj2 = new Employee(201, "soni");
        obj2.getDetails();
        Employee obj3 = new Employee(301, "rani");
        obj3.getDetails();
        Employee obj4 = new Employee();
    }
}
