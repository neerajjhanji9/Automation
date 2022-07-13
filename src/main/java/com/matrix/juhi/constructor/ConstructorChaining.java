package com.matrix.juhi.constructor;

public class ConstructorChaining {

    ConstructorChaining(int a, int b) {

        System.out.println("Happy Monsoon");
    }
    ConstructorChaining(){
        this("juhi");
        System.out.println("Constructor Chaining");

    }

    ConstructorChaining(String name){
        System.out.println("Happy Summer");
    }
    public void add(){

    }

    public static void main(String[] args) {
        new ConstructorChaining  (20,30);
        new ConstructorChaining();
    }



}
