package com.matrix.kishor.corejava.instanceblock;

public class InstanceBlock1 {
    int a;

    {
        a=30;
        System.out.println("In instance block");
    }
    public InstanceBlock1(){
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        InstanceBlock1 i=new InstanceBlock1();
    }
}
