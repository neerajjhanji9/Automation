package com.matrix.jayesh.abstractTest;

abstract class AbstractTestClass{
    /**
     * A class which is declare as abstract class
     * must be used abstract keyword
     * can have abstract and non-abstract methods.
     * * can not be instantiated
     * have constructor
     * used static and final method
     * can not used abstarct instantiated
     *
     * ***/

    final static int MAXVALUE = 50;

    public static void main(String[] args) {

    }

    void setData(){
        System.out.println("Set data ");
        System.out.println("Max value is= "+MAXVALUE);
    }
}
