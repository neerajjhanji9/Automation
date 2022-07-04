package com.matrix.gayathri.constructors;

public class ConstructorChaining {

    ConstructorChaining (){
        this("Chaining");
        System.out.println("No params constructor");

    }
    ConstructorChaining (String name){
        System.out.println("Single param Constructor");

    }
    ConstructorChaining ( int a , int b){
        this();
        System.out.println("Hi, params Constructor: "+ a +','+ b);

    }

    public static void main(String[] args) {
        ConstructorChaining obj1 = new ConstructorChaining(10,20);
    }
}
