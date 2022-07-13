package com.matrix.mohita.constructors;

public class Employee1 {
    int empId;
    String name;

    public Employee1(int id, String nm) {   // parameterized constructor
        empId = id;
        name = nm;
        System.out.println(id);
        System.out.println(nm);
    }

    /* public void getDetails(){            without calling method , printing using constructor
    * System.out.println(empId);
    * System.out.println(name);
  }*/
      public Employee1(){
          System.out.println("Hello,no args constructor");   // no args constructor
      }

    public static void main(String[] args) {
        Employee1 obj1 = new Employee1(101,"rani");
        // obj1.getDetails();
        Employee1 obj2 = new Employee1(201,"ram");
        // obj2.getDetails();
        Employee1 obj3 = new Employee1(301,"soni");
        // obj3.getDetails();
        Employee1 obj4 = new Employee1();
    }

}