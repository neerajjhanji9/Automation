package com.matrix.shriniwas.corejava.constructor;

public class TestConstructor2 {

    public void doAddition() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition of a and b is : " + c);
    }

    public void TestConstructor2() {
        System.out.println("I am in TestConstructor2 method");
    }

    public TestConstructor2() {
        int d = 10;
        int e = 20;
        int f = d + e;
        System.out.println("Addition of d and e is : " + f);
    }

    public static void main(String[] args) {
        TestConstructor2 obj = new TestConstructor2();
        // obj.doAddition();
    }
}
