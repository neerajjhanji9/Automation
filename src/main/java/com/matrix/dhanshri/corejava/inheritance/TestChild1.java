package com.matrix.dhanshri.corejava.inheritance;

public class TestChild1 extends TestParent1{
    public void m1(){
        System.out.println("This is child class m1 method");
    }

    public static void main(String[] args) {
        TestChild1 tc1= new TestChild1();
        tc1.m1();
        tc1.m2();
        tc1.m3();


    }
}
