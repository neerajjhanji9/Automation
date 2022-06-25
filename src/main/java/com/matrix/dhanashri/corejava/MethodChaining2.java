package com.matrix.dhanashri.corejava;

public class MethodChaining2 {

    public void m1(String str){
        System.out.println(str);

    }

    public void m2(int a){
        System.out.println(a);
        m1("Dhanashri");
    }

    public static void main(String[] args) {

        MethodChaining2 ob= new MethodChaining2();
        //ob.m1("str");
        ob.m2(10);
    }



}
