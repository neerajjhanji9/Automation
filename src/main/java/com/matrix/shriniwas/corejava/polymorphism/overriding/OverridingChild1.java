package com.matrix.shriniwas.corejava.polymorphism.overriding;

public class OverridingChild1 extends OverridingParent1 {

    // Rules:
    /* 1. Performed in different classes  i.e Child and Parent relationship (IS-A relationship)
       2. Same method name and same parameters i.e Method signature should be the same
       3. Data types of parameters should also be the same
       4. Sequence of parameters should also be the same
    */

    public void m1() {
        System.out.println("Child:: m1 method");
    }

    public static void main(String[] args) {
        OverridingParent1 obj = new OverridingChild1();
        obj.m1();
    }
}
