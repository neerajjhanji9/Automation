package com.matrix.rahuly.blocks;

public class InstanceBlock {

    {
        int a = 8;
        System.out.println(a);
    }

    public InstanceBlock(String name, char ch) {
        System.out.println(name);
        System.out.println(ch);
    }

    public InstanceBlock() {
        System.out.println("I am in Instance Block");

    }

    public void getData() {
        boolean b = 13*7 == 7*13;
        System.out.println(b);
    }

    public static void main(String [] args) {
        InstanceBlock i = new InstanceBlock();
        new InstanceBlock("Rahul",'R');
        i.getData();

    }
}

