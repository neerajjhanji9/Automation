package com.matrix.gayathri.constructors;

public class Employee2 {

      int empId;
      String name;

     public Employee2(int empid, String name){   //parameterized constructor
        this.empId = empid;
        this.name =name;

    }

     public void getDetails(){
       System.out.println(empId);
        System.out.println(name);
    }
     public Employee2(){
         System.out.println("Hello, no args constructor");  // no args constructor

    }


}
