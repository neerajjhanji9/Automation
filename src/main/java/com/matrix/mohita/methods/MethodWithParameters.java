package com.matrix.mohita.methods;

public class MethodWithParameters {

    public void subtract(int a, int b){
        System.out.println("Subtraction of a and b is : " + (a+b));
    }
    public static void multiply(double a, double b){
        System.out.println("multiplication of a and b is : " + (a*b));
    }
    public static void name (String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        MethodWithParameters obj = new MethodWithParameters();
        obj.subtract(100,50);
        multiply(10.5,15.4);
        MethodWithParameters.name("Ashish");
    }
}
