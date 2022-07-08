package com.matrix.juhi.constructor;

public class ConstructorChaining {

    ConstructorChaining(int a, int b) {
        this();
        System.out.println("Happy Monsoon");
    }
    ConstructorChaining(){
        System.out.println("Constructor Chaining");
    }
    public void add(){

    }

    public static void main(String[] args) {
        new ConstructorChaining (20,30);
    }



}
