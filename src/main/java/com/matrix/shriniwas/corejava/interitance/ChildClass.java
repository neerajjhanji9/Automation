package com.matrix.shriniwas.corejava.interitance;

public class ChildClass extends ParentClass {

    public ChildClass() {
        super(10);
        // super(10);  // super() will be added by compiler as a first statement in Constructor
        System.out.println("Child class constructor");
    }

    void m1() {
        System.out.println(a);
        System.out.println(name);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
    }
}
