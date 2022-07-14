package com.matrix.amitb.corejava.methods;

public class MethodWithParameters1 {

    public static void add( int a,int b,int c){

        System.out.println("Addition of a,b,c is :" +(a+b+c));
    }

    public static void main(String[] args){

        MethodWithParameters1 obj = new MethodWithParameters1();
        MethodWithParameters1.add(10,20,30);
    }
}
