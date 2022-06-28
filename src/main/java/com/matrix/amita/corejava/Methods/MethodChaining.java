package com.matrix.amita.corejava.Methods;

public class MethodChaining {

    public void m1(){
        System.out.println("I am Amita");
        m2();
    }

    public void m2(){
        System.out.println("I completed Electrical Engineering");
        m3();
    }

    public void m3(){
        System.out.println("My hometown is Solapur");
    }

    public static void main(String[] args) {
        MethodChaining obj = new MethodChaining();
        obj.m1();
    }
}
