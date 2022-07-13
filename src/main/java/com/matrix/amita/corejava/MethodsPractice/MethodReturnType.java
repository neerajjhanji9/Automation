package com.matrix.amita.corejava.MethodsPractice;

public class MethodReturnType {

    int m1(){
        int x=20;
        System.out.println(x);
        return x;
    }

    float m2(){
        float y=20.2f;
        System.out.println(y);
        return y;
    }

    boolean m3(){
        boolean z=true;
        System.out.println(z);
        return z;
    }

    public static void main(String[] args) {
        MethodReturnType obj=new MethodReturnType();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
