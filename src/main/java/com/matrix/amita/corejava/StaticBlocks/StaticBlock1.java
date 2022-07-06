package com.matrix.amita.corejava.StaticBlocks;

public class StaticBlock1 {

    static{
        System.out.println("Learning Static Blocks");
    }

    StaticBlock1(){
        System.out.println("0-args constructor");
    }

    StaticBlock1(char ch){
        System.out.println("1-args constructor");
        System.out.println(ch);
    }

    public static void main(String[] args) {
        new StaticBlock1();
        new StaticBlock1('A');
    }
}
