package com.matrix.kishor.corejava.staticblock;

public class StaticBlock2 {


    static {
        System.out.println("In Second static block");
    }
    static {
        System.out.println("In first static block");
    }
    {
        System.out.println("In instance block");
    }
    StaticBlock2 (){
        System.out.println("In constructor");
    }
    StaticBlock2 (int a){
        System.out.println("In second constructor");
    }

    public static void main(String[] args) {
        new StaticBlock2(); //nameless object
        new StaticBlock2(10);

    }
}
