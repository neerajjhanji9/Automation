package com.matrix.mohita.Variables;

// Instance Variables declaring in class level

public class InstanceVariables {

    int a = 10;
    int b = 15;
    String name = "Mahi";

    // Instance Method
    public void m1 () {
        // Instance area : Direct access
        System.out.println(name);
        System.out.println(a);

    }

    // Static Method
    public static void m2() {
        // Static area : By Using Object reference
        InstanceVariables obj = new InstanceVariables();      // Object Creation
        System.out.println(obj.b);
    }

    // Constructor
    public InstanceVariables() {
        System.out.println(a);
    }
    // Block
    {
        System.out.println(b);
    }

    public static void main(String[] args) {
        m2();
        InstanceVariables ob = new InstanceVariables();
        ob.m1();


    }
}
