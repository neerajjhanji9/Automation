package com.matrix.jayesh.covariantReturnType;

public class ClassB {

    ClassB foo(){
        System.out.println("Class b");
        return this; // same as new ClassB();
    }

    public int display(){
        //System.out.println("Display value.");
        return 10;
    }
}
