package com.matrix.dhanshri.corejava.staticandinstanceblocks;

public class StaticBlock1 {

    static{
        System.out.println("this is 1st static block");
    }

    static{
        System.out.println("this is 2nd static block");
    }

    {
        System.out.println("I am Instance block");
    }
    StaticBlock1(){
        System.out.println("I am in 0-args constructor");
    }
    StaticBlock1(int age){
        System.out.println(" Age value is :  "      +age);
    }

    public static void main(String[] args) {
        StaticBlock1 sb1= new StaticBlock1();
        StaticBlock1 sb2= new StaticBlock1(25);
    }
}
