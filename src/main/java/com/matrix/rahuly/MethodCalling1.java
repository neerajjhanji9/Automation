package com.matrix.rahuly;

import com.matrix.shriniwas.corejava.methods.MethodCalling;

public class MethodCalling1{
    //Method declaration
    public void getData(){
        //Method Implementation.
        System.out.println("I am in method calling session");
    }

    public void getData1(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);

    }
    //Static Method Declaration.
    public static void getInfo(){
        //Static Method Implementation
        String S = "Rahul";
        boolean b = true;
        System.out.println(S);
        System.out.println(b);
    }

    public static void main(String[] args){
        MethodCalling1 m1 = new MethodCalling1();
        //Method Calling.
        m1.getData();
        m1.getData1();
        //Direct Call
        getInfo();
        //MethodCalling1.getInfo(); only for static method declaration.

    }
}
