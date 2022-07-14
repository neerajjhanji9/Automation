package com.matrix.shriniwas.corejava.polymorphism.overloading;

public class ConstructorOverloading {

    public ConstructorOverloading() {
        System.out.println("In 0-args constructor");
    }

    public ConstructorOverloading(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(10, 20);
    }
}
