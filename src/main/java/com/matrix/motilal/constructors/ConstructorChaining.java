package com.matrix.motilal.constructors;

public class ConstructorChaining {

    int a;
    int b;
    ConstructorChaining(){
        this(1);
        System.out.println("Default constructor");
    }
    ConstructorChaining(int a){
        this(a,2);
        System.out.println("Single parameter constructor");
    }
    ConstructorChaining(int a,int b){
        System.out.println("Two parameter constructor ="+(a*b));
    }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
