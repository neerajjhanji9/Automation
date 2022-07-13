package com.matrix.amitb.corejava.methods;

public class TestMethodWithParameters {

    public void addition (int a,int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args){
        TestMethodWithParameters obj = new TestMethodWithParameters();

        obj.addition(100,200);

    }
}

