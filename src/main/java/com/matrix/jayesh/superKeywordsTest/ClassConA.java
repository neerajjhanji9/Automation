package com.matrix.jayesh.superKeywordsTest;

public class ClassConA extends ClassConB{
    /* ClassConA(){
        // default is super keywords.
        System.out.println("class constructor A");
    }*/

    public ClassConA(int i, String test, int i1) {
        super(i,test);
        System.out.println("test class constructor a"+i1);
    }
}
