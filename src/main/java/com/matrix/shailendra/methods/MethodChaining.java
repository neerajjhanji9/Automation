package com.matrix.shailendra.methods;

public class MethodChaining {
    public void m1() {
        System.out.println("I am in m1 method");
    }

    public void m2() {
        m1();
        System.out.println("I am in m2 method");
    }

    public void m3() {
        m2();
        System.out.println("I am in m3 method");
    }

    public static void main(String[] args) {
        MethodChaining obj = new MethodChaining();
        obj.m3();
    }
}
