package com.matrix.shriniwas.corejava.constructor;

public class ConstructorChaining {

    ConstructorChaining(int a, int b) {
        this();
        System.out.println("I am in param-constructor");
    }

    ConstructorChaining() {
        this("Shriniwas");
        System.out.println("I am in no param-constructor");
    }

    ConstructorChaining(String name) {
        System.out.println("I am in param-constructor: "+name);
    }

    public static void main(String[] args) {
        new ConstructorChaining(10, 20);
        new ConstructorChaining();
    }
}
