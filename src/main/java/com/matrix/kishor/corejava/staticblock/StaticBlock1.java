package com.matrix.kishor.corejava.staticblock;

public class StaticBlock1 {
    static {
        System.out.println("In first static block");
    }
    static {
        System.out.println("In Second static block");
    }
    StaticBlock1 (){
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
        new StaticBlock1();

    }
}
