package com.matrix.jayesh.overloading;

public class OverloadMainMethod {
    public static void main(String[] args) {
        System.out.println("first main method");
        // call only that main method
    }

    public static void main(String args) {
        System.out.println("second main method");
    }

    public static void main(int rollNo) {
        System.out.println("third main method");
    }
}
