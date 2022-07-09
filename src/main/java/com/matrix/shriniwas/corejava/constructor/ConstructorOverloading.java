package com.matrix.shriniwas.corejava.constructor;

public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("I am in Default Constructor");
    }

    ConstructorOverloading(int age, String name) {
        System.out.println("I am in Param Constructor");
        System.out.println(age + " --- "+ name);
    }

    public void getData() {
        System.out.println("I am in Method..");
    }

    public static void main(String[] args) {
        // 1st way of creating object
        ConstructorOverloading obj1 = new ConstructorOverloading(); // Names Object
        obj1.getData();

        // 2nd way
        new ConstructorOverloading().getData(); // Nameless Object
        new ConstructorOverloading(10, "Shri1").getData(); // Nameless Object

        obj1.getData();

        // 3rd way
        ConstructorOverloading obj2;
        obj2 = new ConstructorOverloading();

    }
}
