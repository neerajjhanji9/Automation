package com.matrix.dhanashri.corejava.staticandinstanceblocks;

public class StaticBlock {

    static{
        System.out.println("I am in 1st static block");
    }

    static{
        System.out.println("I am in 2nd static block");
    }

    {
        System.out.println("I am in Instance block");
    }

    StaticBlock(){
        System.out.println("I am in 0-args constructor");
    }

    StaticBlock(int age){
        System.out.println("I am in param constructor");
    }

    public static void main(String[] args) {
        StaticBlock s1= new StaticBlock();
        System.out.println("_______________________________");
        StaticBlock s2= new StaticBlock(25);
        System.out.println("_________________________");
        StaticBlock s3= new StaticBlock();
    }
}
