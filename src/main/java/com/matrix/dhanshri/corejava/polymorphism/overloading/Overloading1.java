package com.matrix.dhanshri.corejava.polymorphism.overloading;

public class Overloading1 {

    public void multiplication() {
        int a = 20;
        int b = 5;
        System.out.println("Multiplication of a*b:  "  +(a*b));
    }
    public void multiplication(int a, int b){
        System.out.println(a*b);
    }

    public void multiplication(int a, int b, int c){
        System.out.println(a*b*c);
    }

    public void multiplication(double a, float b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Overloading1 o= new Overloading1();
        o.multiplication(10, 20);
        o.multiplication(10, 20, 10);
        o.multiplication(10.5, 15.0f);
        o.multiplication();
    }
}
