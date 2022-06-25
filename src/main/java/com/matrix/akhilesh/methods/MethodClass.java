package com.matrix.akhilesh.methods;

public class MethodClass {

    int age = 10;

    public static void main(String[] args) {
        MethodClass mt = new MethodClass();
        mt.m4();
    }

    public void m1(){
        System.out.println(age);
    }

    public void m2(int a, int b){
        System.out.println(a+b);
    }

    public static void m3(String str){
        System.out.println(str);
    }

    public void m4(){
        m1();
        m2(10,20);
        m3("Akhilesh");
    }
}
