package com.matrix.rahuly.constructor;

public class Child extends Parent {

    int age;
    Child(int ag) {
        super(20);
        this.age = ag;
        System.out.println("I am going to school");
        System.out.println("My age:" + ag);

    }

    public static void main(String[] args) {
        new Child(10);

    }

}
