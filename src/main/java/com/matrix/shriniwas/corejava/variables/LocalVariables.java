package com.matrix.shriniwas.corejava.variables;

public class LocalVariables {

    // Method
    public void getData() {
        // Code, Logic
    }

    // Constructor
    public LocalVariables() {
        int b = 20;
        String str = "Shriniwas";
        int arr [] = {10, 20};
        int age = 50;
        System.out.println(b);
        System.out.println(arr);
    }

    // Block
    {
        int a = 50;
        System.out.println(a);
    }

    public void getDetails(int age) {
        // Local variable
        int data = 10;
        System.out.println(data);
        System.out.println(age);
    }

    public static void main(String[] args) {
        // local variables
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }
}
