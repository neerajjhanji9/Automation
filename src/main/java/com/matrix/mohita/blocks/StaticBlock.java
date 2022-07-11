package com.matrix.mohita.blocks;

public class StaticBlock {

    static {
        System.out.println("I am in static block");
    }
     StaticBlock () {
        System.out.println("Hi, 0-args constructor!");
    }
    StaticBlock (int a ){
        System.out.println("Hi, 1-args constructor");
    }

    public static void main(String[] args) {
        new StaticBlock();
        new StaticBlock(10);

    }
}
