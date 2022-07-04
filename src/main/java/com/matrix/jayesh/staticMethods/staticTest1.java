package com.matrix.jayesh.staticMethods;

public class staticTest1 {
    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        System.out.println("main class");
    }
}

/***
 *
 * public class staticTest1 {
 *     static {
 *         System.out.println("static");
 *     }
 * }
 *
 * show an error message as
 * Error: Main method not found in class A3, please define the main method as:
 *    public static void main(String[] args)
 * or a JavaFX application class must extend javafx.application.Application
 * ***/
