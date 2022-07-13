package com.matrix.mohita.constructors;

public class Child extends Parent{

    Child(){
    // super() : compiler will add super() keyword as first statement by default
        System.out.println("Im in Child constructor");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}
