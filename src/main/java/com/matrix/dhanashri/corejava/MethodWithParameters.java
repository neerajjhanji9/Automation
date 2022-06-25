package com.matrix.dhanashri.corejava;

public class MethodWithParameters {
    public void addition(int a, int b){
        System.out.println("Addition of a and b is: "  +(a+b)  );
    }

    public void multiply(int a, int b){
        System.out.println("Multiplication of a*b is: "   +(a*b));
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void getName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        MethodWithParameters mp= new MethodWithParameters();
        mp.addition(10, 20);//30
        mp.multiply(30, 10);//300
        mp.getName("Dhanashri");
        MethodWithParameters.add(30, 40, 50);//120-static with param with class name
    }
}
