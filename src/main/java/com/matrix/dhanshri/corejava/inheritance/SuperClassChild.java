package com.matrix.dhanshri.corejava.inheritance;

public class SuperClassChild extends SuperClassParent{

    public void m1(){
        System.out.println("I am in Child class: m1 method");
    }

    public void m2(){
        this.m1();
        super.m1();
        System.out.println("I am in Child class: m2 method");
        m3();
        super.m4(20, 30);
    }
    public void m3(){
        System.out.println("I am in Child class m3 method");
    }

    public static void main(String[] args) {
        SuperClassChild sup1= new SuperClassChild();
        sup1.m2();
        sup1.m4(30, 30);
    }
}
