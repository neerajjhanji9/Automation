package com.matrix.akhilesh.instanceblock;

public class InstanceBlock1 {

    int a;

    public static void main(String[] args) {
        new InstanceBlock1();
        new InstanceBlock1(25);
    }

    {
        a=20;
        System.out.println("My employee id is : "+a);
    }

    public InstanceBlock1(){
        System.out.println("Instance Block");
    }

    public InstanceBlock1(int age){
        System.out.println("My age is : "+age);
    }
}
