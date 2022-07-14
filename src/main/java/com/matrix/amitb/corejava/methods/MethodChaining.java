package com.matrix.amitb.corejava.methods;

public class MethodChaining {

    public void m1(){
        System.out.println("I am Civil Engg");
        m2();
    }

    public void m2(){
        System.out.println("I am Tester");
        m3();
    }

    public void m3(){
        System.out.println("I am an Engg");
    }

    public static void main(String[] args){

        MethodChaining obj = new MethodChaining();
        obj.m1();
    }
}
