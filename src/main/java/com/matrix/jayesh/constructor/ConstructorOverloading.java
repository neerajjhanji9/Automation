package com.matrix.jayesh.constructor;

// default extent is object
public class ConstructorOverloading {

    ConstructorOverloading(){
        System.out.println("first constructor");
    }

    ConstructorOverloading(int a){
        System.out.println("Second constructor"+ a);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading(); //name of object
        new ConstructorOverloading(10); // nameless
    }
}
