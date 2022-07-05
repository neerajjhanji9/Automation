package com.matrix.shriniwas.corejava.staticblocks;

public class StaticBlocks1 {

    static {
        System.out.println("1st Static Block..");
    }

    static {
        System.out.println("2nd Static Block..");
    }

    {
        System.out.println("1st Instance Blocks");
    }

    StaticBlocks1() {
        System.out.println("0-args Constructor");
    }

    StaticBlocks1(int rollNo) {
        System.out.println("1-args Constructor");
    }

    public static void main(String[] args) {
        new StaticBlocks1();
        new StaticBlocks1(10);
    }
}
