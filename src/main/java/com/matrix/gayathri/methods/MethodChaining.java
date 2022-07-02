package com.matrix.gayathri.methods;

public class MethodChaining {

    public void m1(){
        System.out.println("Hello,");
        m2();
    }
    public void m2() {
        System.out.println("Hello,This is");
        m3();
    }
    public void m3(){
        System.out.println("Hello,This is Method Chaining");
    }

    public static void main(String[] args) {
        MethodChaining obj = new MethodChaining();
        obj.m1();
    }



}
