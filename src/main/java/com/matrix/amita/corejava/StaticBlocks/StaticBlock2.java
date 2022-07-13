package com.matrix.amita.corejava.StaticBlocks;

public class StaticBlock2 {

    static{
        System.out.println("1st program");
    }

    static{
        System.out.println("2nd program");
    }

    StaticBlock2(){
        System.out.println("1st Constructor");
    }

    public static void main(String[] args) {
        //no need of object creation for static blocks
        new StaticBlock2();     // for instance blocks need object creation
    }
}
