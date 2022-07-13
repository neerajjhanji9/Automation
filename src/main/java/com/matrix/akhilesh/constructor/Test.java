package com.matrix.akhilesh.constructor;

public class Test {

    public static void main(String[] args) {
        method(null);
        System.out.println("main method");

//        Test mai = new Test();
//        mai.m
    }

    public static void method(Object o){
        System.out.println("Object Method");
    }

    public static void method(String s){
        System.out.println("String Method");
    }

    public static void main(String args){
        System.out.println("Overloadedmain");
    }
}
