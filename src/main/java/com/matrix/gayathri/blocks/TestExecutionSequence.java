package com.matrix.gayathri.blocks;

public class TestExecutionSequence {

    //constructor1
    TestExecutionSequence(){
        System.out.println("Hello No-Params Constructor!");
    }

    //constructor2
    TestExecutionSequence(int a, int b){
        System.out.println("Hello Args Constructor!");
    }

    //Static block
       static {
        System.out.println("Hello, Static block!");
    }

    //Instance Block
    {
        System.out.println("Hello, Instance block!");
    }

    public static void main(String[] args) {
        new TestExecutionSequence();
        new TestExecutionSequence(10,20);
    }



}
