package com.matrix.motilal.methods;

public class MethodWithOrWithoutPara {
    public void m1() //method without para
    {
        System.out.println("method without para");
    }
    public void m1(int a) //method with para
    {
        System.out.println("method with para :"+a);
    }
    public static void main(String[] args) {
        MethodWithOrWithoutPara p=new MethodWithOrWithoutPara();
        p.m1();
        p.m1(2);
    }
}
