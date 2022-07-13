package com.matrix.juhi;

public class MethodWithParameter2 {

    public void addition(int a, int b){
        System.out.println(a+b);
    }
    public void divide (int c, int d){
        System.out.println(c/d);
    }
    public static void multiply(int f, float g)
    {
        System.out.println(f * g);
    }

    public static void main(String[] args) {
        MethodWithParameter2 e = new MethodWithParameter2();
        e.addition(25, 5);
        e.divide(30, 5);

        MethodWithParameter2.multiply(6,9);
    }
}
