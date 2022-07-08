package com.matrix.juhi.constructor;

public class Child extends Parent{
    Child (){
        super();
        System.out.println("I am in child constructor");
    }

    public static void main(String[] args) {
        Child a = new Child();
    }
}
