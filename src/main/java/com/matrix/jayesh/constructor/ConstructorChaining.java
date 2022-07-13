package com.matrix.jayesh.constructor;

public class ConstructorChaining {

    // default constructor
    ConstructorChaining(){
        this(10, 20);
        System.out.println("default ");
    }

    // parametr constructor
    ConstructorChaining(int a, int b){
        this("jayesh");
        System.out.println("value of first: "+a +" value of second : "+b);
    }

    ConstructorChaining(String myName){
        System.out.println("Default name is"+myName);
    }
    public static void main(String[] args) {
            new ConstructorChaining();
    }
}
