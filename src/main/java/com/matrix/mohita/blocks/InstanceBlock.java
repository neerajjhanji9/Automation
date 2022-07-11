package com.matrix.mohita.blocks;

public class InstanceBlock {
    int a ;
    String b;

    {
        a = 40;
        b = "Ashish";
        System.out.println(b + " : I am in Instance block");
    }
    InstanceBlock (){
        System.out.println( a + " is in constructor block");
    }
    InstanceBlock (String st){
        System.out.println(st);
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock("I am 2nd constructor");
    }
}
