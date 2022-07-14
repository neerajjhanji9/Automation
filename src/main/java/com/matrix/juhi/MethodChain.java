package com.matrix.juhi;

public class MethodChain {

    public void apple (){

        System.out.println("An apple a day keeps doctor away");
        orange();
    }

    public void orange(){

        System.out.println("Rich in vitamin c");
    }

    public static void main (String[] args){

        MethodChain a = new MethodChain();
        a.apple();
    }
}
