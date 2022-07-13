package com.matrix.amita.corejava.InstanceBlock;

public class InstanceBlock1 {

    int a;

    {
        a=50;   //it runs each when we call an object. Instance blocks are common for all objects
        System.out.println("This is Instance Block...");
    }

    InstanceBlock1(){
        System.out.println("This is Constructor...");
        System.out.println("Answer:" + a);
    }

    InstanceBlock1(String Name){
        System.out.println("My Name is:" + Name);
    }

    public static void main(String[] args) {
        InstanceBlock1 obj=new InstanceBlock1();
        InstanceBlock1 obj1=new InstanceBlock1("Amita");

    }
}