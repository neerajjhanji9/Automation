package com.matrix.juhi;

public class MethodWithReturnType {

    public int multiply(){

        int a = 20;
        int b = 30;
        int c = a * b;
        return c;
    }

    public static void main(String[] args) {
        MethodWithReturnType r = new MethodWithReturnType();
        int i = r.multiply();
        System.out.println(i);
    }
}
