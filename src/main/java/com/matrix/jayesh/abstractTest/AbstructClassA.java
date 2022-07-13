package com.matrix.jayesh.abstractTest;

abstract class AbstructClassA {

    AbstructClassA(){
        // constructor
        System.out.println("This is constructor");
    }

    //abstract void display();

    public int addTwoNumbers(){
        int k= 10+20;
        return k;
    }

    public int addTwoNumbers(int i, int i1) {
        int k= i+i1;
        return k;
    }
}
