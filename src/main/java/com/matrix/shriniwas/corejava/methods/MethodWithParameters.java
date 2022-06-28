package com.matrix.shriniwas.corejava.methods;

public class MethodWithParameters {

    public void addition(int a, int b) {
        System.out.println("Addition of a and b is: " + (a+b)); // 30
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication of a and b is: " + (a*b)); // 30
    }

    public static void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    
    public void getName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        MethodWithParameters obj = new MethodWithParameters();
        obj.addition(10, 20); // 30
        obj.addition(30, 40); // 70

        obj.multiply(10, 20);
        obj.getName("Shriniwas");

        MethodWithParameters.add(10,20,30); // Static method with param

    }
}
