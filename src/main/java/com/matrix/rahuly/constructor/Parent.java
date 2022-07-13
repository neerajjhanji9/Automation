package com.matrix.rahuly.constructor;

public class Parent {

    int a;
    Parent(int ab) {
        this.a = ab;
        System.out.println("Where are you going");
        System.out.println("What's your marks:" + ab);
    }

    public static void main(String[] args) {
        new Parent(5);


    }
}
