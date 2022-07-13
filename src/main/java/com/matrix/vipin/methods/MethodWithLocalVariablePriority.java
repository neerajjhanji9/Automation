package com.matrix.vipin.methods;

public class MethodWithLocalVariablePriority {

    int a = 100;
    int b = 200;

    public void multiplication(int a, int b){
        System.out.println(a*b);
        System.out.println(this.a - this.b);
        System.out.println(this.a + this.b);
        System.out.println(a+this.b);
        this.a =a;
        this.b =b;

    }

    public static void main(String[] args) {
        MethodWithLocalVariablePriority obj = new MethodWithLocalVariablePriority();
        obj.multiplication(20,30);
    }
}
