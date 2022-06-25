package com.matrix.amita.corejava.variables;

public class StaticVariable {

    // static variable
    static int age = 10;

    // instance method
    public void getData() {
        // instance area
        System.out.println(age);
    }

    // static method
    public static void getData1() {
        System.out.println(age);
    }

    public static void main(String[] args) {
        System.out.println("static variable.age");
    }
}
