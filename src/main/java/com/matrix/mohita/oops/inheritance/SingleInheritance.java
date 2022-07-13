package com.matrix.mohita.oops.inheritance;
/* Calculating the salary of an employee using
  single inheritance with the object class*/
 class Employee{
     float sal = 15000;
}
 class Main extends Employee{
     float b = 5000;
     float temp = sal + b;

     public static void main(String[] args) {
         Main ob = new Main();
         System.out.println("Salary amount is: "+ ob.sal);
         System.out.println("Extra Bonous is: "+ob.temp);
     }
 }
