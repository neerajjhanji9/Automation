package com.matrix.vipin.methods;

public class MethodChaining {

    public void m1(){
        System.out.println("i am in m1 method");
        m2();
    }
    public void m2(){
        System.out.println("i am in method 2");
        m3();
    }
    public void m3(){
        System.out.println("i am in method 3");

    }

    public static void main(String[] args) {
        MethodChaining obj = new MethodChaining();
        obj.m1();
    }

}
