package com.matrix.jayesh.thisTest;

public class ReturnMethod {
    /*returnMethod(){
        return this; //  Cannot return a value from a method with void result type
    } */

    ReturnMethod callM(){
        return this;
    }
    public void display(){
        System.out.println("Call method");
    }

    public static void main(String[] args) {
        ReturnMethod obj = new ReturnMethod();
        obj.callM().display();
    }
}
