package com.matrix.jayesh.constructor;

public class ParentTest extends ChildTest{

    ParentTest(){
        super();
        // default is super class and call child class
        System.out.println("Parent class");
    }
    public static void main(String[] args) {
        new ParentTest();
    }
}
