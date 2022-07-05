package com.matrix.jayesh.staticMethods;

public class StaticTest2 {

    static {
        System.out.println("Static block first");
        // run only once
        //run before constructor
        // used to write static value, Files
    }
    static {
        System.out.println("Static block second");
    }
    {
        System.out.println("Instance brackets");
        // tightly blind with constructor
    }

    StaticTest2(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        new StaticTest2();
    }
}
