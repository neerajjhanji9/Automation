package com.matrix.jayesh.InterfaceTest;

public class TestClass implements ClassA, Showable {
    /**
     * Multiple inheritance in Java by interface
     *
     * **/
    public void display(){
        System.out.println("Test ");
    }

    public void cal(){
        System.out.println("Test cal");
    }

    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.display();
        obj.cal();
        obj.msg(); // default method

    }
}
