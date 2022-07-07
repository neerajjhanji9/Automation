package com.matrix.juhi.constructor;

public class SimpleConstructorEx {

    int a;
    String b;

    //constructor

    SimpleConstructorEx (int a, String b) {

        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        SimpleConstructorEx d1 = new SimpleConstructorEx(20,"juhi");
        SimpleConstructorEx d2 = new SimpleConstructorEx(40,"anil");

    }
}
