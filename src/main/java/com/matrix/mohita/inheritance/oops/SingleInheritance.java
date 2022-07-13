package com.matrix.mohita.inheritance.oops;

public class SingleInheritance {
}
/* Calculating the salary of an employee using single inheritance with the parent class*/
class Employee{
    float sal=15000;
}
class main extends Employee{
    float b = 5000;
    float temp= sal+ b;

    public static void main(String[] args) {
        main ob = new main();
        System.out.println("Salary amount is :"+ ob.sal);
        System.out.println("Extra Bonous is:"+ ob.temp);
    }
}