package com.matrix.dhanashri.corejava.constructorconcept;

public class Child extends Parent{

    Child(){
        //Super() is keyword , Compiler will add super() and call to parent class
        System.out.println("I am in child constructor");
    }

    public static void main(String[] args) {
        Child ch= new Child();


    }

}
