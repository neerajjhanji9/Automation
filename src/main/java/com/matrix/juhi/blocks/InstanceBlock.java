package com.matrix.juhi.blocks;

public class InstanceBlock {

    String name;
    //Instance block is created with - {}
    {
        name ="juhi";
        System.out.println("I am in instance block and it going to execute first even if constructor is called first");
    }
    InstanceBlock (){
        System.out.println("I am in constructor");
    }

    public void add(){

    }

    public static void main(String[] args) {
        InstanceBlock a = new InstanceBlock();
    }

}
