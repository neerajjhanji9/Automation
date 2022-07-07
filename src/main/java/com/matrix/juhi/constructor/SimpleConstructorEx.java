package com.matrix.juhi.constructor;

public class SimpleConstructorEx {

    int a;
    String b;

    //Parameterized constructor

    SimpleConstructorEx (int a, String b) {

        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(b);
    }

    //No args constructor
    public SimpleConstructorEx (){

        System.out.println("No args constructor");
    }
    public static void main(String[] args) {
        SimpleConstructorEx d1 = new SimpleConstructorEx(20,"juhi");
        SimpleConstructorEx d2 = new SimpleConstructorEx(40,"anil");

        SimpleConstructorEx d3 = new SimpleConstructorEx();
    }
}
