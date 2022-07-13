package com.matrix.amita.corejava.constructor;

public class Child extends Parent{

    Child(){
        //super();      // by default Compiler will add super() keyword to call constructor
                      // this. used to call another constructor in same class
        System.out.println("I am in Child Constructor");
    }

    public static void main(String[] args) {
        Child ch=new Child();
    }
}
