package com.matrix.rahuly;

import com.matrix.shriniwas.corejava.methods.MethodCalling;

public class MethodCalling1{

    public void getData(){
        System.out.println("I am in method calling session");
    }

    public void getData1(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);

    }
    public static void getInfo(){
        String S = "Rahul";
        boolean b = true;
        System.out.println(S);
        System.out.println(b);
    }

    public static void main(String[] args){
        MethodCalling1 m1 = new MethodCalling1();
        m1.getData();
        m1.getData1();
        getInfo();
    }
}
