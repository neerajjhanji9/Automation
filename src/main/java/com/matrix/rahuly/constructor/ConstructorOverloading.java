package com.matrix.rahuly.constructor;

import java.sql.SQLOutput;

public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("I am in Constructor Overloading session");
    }

    ConstructorOverloading(int num, String name) {
        System.out.println("I am by Flight");
        System.out.println(num + "----" + name);
    }
    void getDetails() {
        System.out.println("Feeling good to learn Java Concept");

    }

    public static void main(String[] args) {
        //1 way for creating obj. - it is used to call multiple methods
        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading(4,"Rahul");
        c1.getDetails();
        System.out.println("------------------");

        //2 way - it is used to call for single method.
        new ConstructorOverloading().getDetails();
        new ConstructorOverloading(3, "Rahul2").getDetails();
        System.out.println("----------");

       //3 way
        ConstructorOverloading c3;
        c3 = new ConstructorOverloading();
        c3 = new ConstructorOverloading(6, "Rahul3");

    }

}
