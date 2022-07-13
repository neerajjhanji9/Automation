package com.matrix.jayesh.overRidingMethod;

public class Test1 extends Test2 {

    public boolean add(int i, int b){
        int c=i+b;
        System.out.println("Return is "+c);

        return false;
    }
}
