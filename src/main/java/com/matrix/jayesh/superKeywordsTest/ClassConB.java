package com.matrix.jayesh.superKeywordsTest;

public class ClassConB {
    private final String test;
    private final int i;
    /* ClassConB(){
        System.out.println("class constructor B");
    } */

    public ClassConB(int i, String test) {
        this.i = i;
        this.test = test;
    }

    public void display(){

        System.out.println("id is = "+i+"name is "+test);
    }
}
