package com.matrix.amitb.corejava.methods;

public class TestMethod1 {

    public void getDetails(int a,int b){

        System.out.println(a-b);
    }

    public static void getInfo(int a,int b){

        System.out.println("The Multification is :"+ a*b);
    }
    public static void main (String[] args){

        TestMethod1 obj = new TestMethod1();
        obj.getDetails(200,100);
        obj.getInfo(5,4);
    }

}
