package com.matrix.akhilesh.staticblock;

public class StaticBlock1 {

    public static void main(String[] args) {
        new StaticBlock1();
        new StaticBlock1(10);
        new StaticBlock1(20,"Akhil");
    }

    static {
        System.out.println("I am a static block");
    }

    StaticBlock1(){
        System.out.println("0-args constructor");
    }

    StaticBlock1(int a){
        System.out.println("1-args constructor");
    }

    StaticBlock1(int b, String str){
        System.out.println("2-args constructor");
    }

    {
        System.out.println("I am a instance block");
    }
}
