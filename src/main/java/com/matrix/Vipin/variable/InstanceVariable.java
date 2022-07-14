package com.matrix.Vipin.variable;

public class InstanceVariable {

    int age = 10; // instance variable are available through out the claas
    String name = "VIPIN";

    // instance method`


    public void m2() {
        System.out.println(age);//instance variable instance area directly access

    }
    //Static method
    public static void m3() {
        InstanceVariable obj = new InstanceVariable();// instance variable static area access by using object reference
        System.out.println(obj.age);
        System.out.println(obj.name);
    }

    public static void main(String[] args) {

    }
}
