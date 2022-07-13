package com.matrix.gayathri.blocks;

public class InstanceBlock {
    int a;
    String b;

    {
        a = 40;
        b = "Ayaan";
        System.out.println(b + " : Im in instance block");

    }
    InstanceBlock (){
        System.out.println( a + " is in constructor block");
    }

    InstanceBlock(String st){
        System.out.println(st);

    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock("Im 2nd constructor");
    }
}
