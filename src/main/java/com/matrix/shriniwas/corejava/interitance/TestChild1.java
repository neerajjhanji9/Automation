package com.matrix.shriniwas.corejava.interitance;

public class TestChild1 extends TestParent1 {

    public void m1() {
        System.out.println("Inside TestChild1:: m1 method");
    }

    public static void main(String[] args) {
        TestChild1 obj = new TestChild1();
        obj.m2();
    }
}
