package com.matrix.jayesh.abstractTest;

public class TestCalss extends AbstractTestClass{
    public static void main(String[] args) {

        TestCalss obj = new TestCalss();
        obj.setData();

        //AbstractTestClass obj = new AbstractTestClass(); //'AbstractTestClass' is abstract; cannot be instantiated

        //super.setData(); //  cannot be referenced from a static context
    }
}
