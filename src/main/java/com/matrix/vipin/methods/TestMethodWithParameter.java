package com.matrix.vipin.methods;

public class TestMethodWithParameter {

    public void addition(int a, int b){
        System.out.println(a+b);
    }
    public static void multiplication(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        TestMethodWithParameter obj = new TestMethodWithParameter();
        obj.addition(20,30);
        TestMethodWithParameter.multiplication(30,30);


    }
}
