package com.matrix.shriniwas.corejava.constructor;

public class Child extends Parent {

    Child() {
        // super(); Compiler will add super() keyword as a first statement in constructor
        super();
        System.out.println("I am in Child Constructor");
    }

    public static void main(String[] args) {
        Child ch = new Child();
        Parent p = new Parent();

        // PrivateConstructor obj = new PrivateConstructor();
    }
}
