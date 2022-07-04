package com.matrix.jayesh.thisTest;

public class returnMethod {
    /*returnMethod(){
        return this; //  Cannot return a value from a method with void result type
    } */

    returnMethod callM(){
        return this;
    }
    public void display(){
        System.out.println("Call method");
    }

    public static void main(String[] args) {
        returnMethod obj = new returnMethod();
        obj.callM().display();
    }
}
