package com.matrix.rahuly.methods;

public class MethodWithParameters {

    public void getData(int a, int b){
        System.out.println(a/b);

    }

    public void getInfo(boolean b, char ch){
        System.out.println(b);
        System.out.println(ch);
    }

    public void getName(String nm, int a, int b){
        System.out.println(nm);
        System.out.println(a*b);

    }

    public static void getData1(int e, int d, int f){
        System.out.println(e+d*f);
    }

    public static void main(String[] args){
        MethodWithParameters obj = new MethodWithParameters();
        obj.getData(10, 5);
        obj.getInfo(true, 'R');
        obj.getName("Rahul",10,8);
        getData1(5,10,20);

    }
}
