package com.matrix.shriniwas.corejava.instanceblock;

public class InstanceBlock1 {
    int a;

    // Instance Block
    {
        a = 20; // Initialize instance variable
        System.out.println("I am in Instance Block..");
    }

    public InstanceBlock1() {
        System.out.println("I am in Constructor..");
        System.out.println("value of a: " +a);
    }

    public InstanceBlock1(int age) {
        System.out.println("My age is: " +age);
    }

    public static void main(String[] args) {
        InstanceBlock1 obj1 = new InstanceBlock1();

        System.out.println("-----------------");

        InstanceBlock1 obj2 = new InstanceBlock1(10);


    }
}
