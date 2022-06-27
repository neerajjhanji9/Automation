package com.matrix.amita.corejava.Methods;

public class MethodWithParameters {

    public void addition(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodWithParameters obj=new MethodWithParameters();
        obj.addition(20,50);
    }
}
