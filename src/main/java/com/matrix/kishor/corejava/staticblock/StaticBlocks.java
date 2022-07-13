package com.matrix.kishor.corejava.staticblock;

public class StaticBlocks {
    static {
        System.out.println("In static block");
    }
    StaticBlocks (int a){
        System.out.println("in constructor");
    }
    StaticBlocks (int a, int b){
        System.out.println("in second constructor");
    }

    public static void main(String[] args) {
        StaticBlocks s=new StaticBlocks(10);
        StaticBlocks s1= new StaticBlocks(10,20);
    }
}
