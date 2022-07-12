package com.matrix.shriniwas.corejava.polymorphism;

public class Overloading1 {

    public void multiplication() {
        int a = 20;
        int b = 30;
        System.out.println(a*b);
    }

    public void multiplication(int a, int b) {
        System.out.println(a*b);
    }

    public void multiplication(int a, int b, int c) {
        System.out.println(a*b*c);
    }

    public void multiplication(int a, int b, int c, int d) {
        System.out.println(a*b*c*d);
    }

    public void multiplication(double a, int b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Overloading1 obj = new Overloading1();

        // at the time of compilation it will check the number of param and data type
        obj.multiplication(10, 10);
        obj.multiplication(10, 10, 10);
        obj.multiplication(10, 10, 10, 10);
        obj.multiplication(10.5, 10);
        obj.multiplication();

    }
}
