package com.matrix.mohita.methods;

public class MethodsWithParameters {

    public void subtract(int a,int b){
        System.out.println("Subtraction of a and b is : "+ (a-b ));
    }
    public static void multiply(double a, double b){
        System.out.println("Multiplication of a and b is :"+ (a*b ));
    }
    public static void name(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        MethodsWithParameters obj = new MethodsWithParameters();
        obj. subtract (100,50 );
        multiply (10.5,15.4);
        MethodsWithParameters. name ("Mohita");
    }
}
