package com.matrix.amitb.corejava.methods;

public class TestMethod {

    public void getData() {

        System.out.println("i am in getData method");
    }

    public static void getInfo() {

        System.out.println("I am in getInfo method");
    }

    public static void main(String[] args){

        TestMethod obj = new TestMethod();

        obj.getData();  //Method Calling
        getInfo();      // Direct Calling
        TestMethod.getInfo();  // Using Class Name
        obj.getInfo();   // Using Object Ref
    }
}
