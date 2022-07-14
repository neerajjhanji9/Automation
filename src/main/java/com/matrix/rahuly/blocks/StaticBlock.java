package com.matrix.rahuly.blocks;

import com.matrix.shriniwas.corejava.staticblocks.StaticBlocks;

public class StaticBlock {

    static {
        System.out.println("I am in static block");
    }

    StaticBlock() {
        System.out.println("I am in Static block concept");
    }

    StaticBlock(int a, String name) {
        System.out.println(a);
        System.out.println(name);
    }

    StaticBlock(char ch, boolean b) {
        System.out.println(ch);
        System.out.println(b);
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        new StaticBlock(10,"Rahul");
        new StaticBlock('R', true);

    }
}
