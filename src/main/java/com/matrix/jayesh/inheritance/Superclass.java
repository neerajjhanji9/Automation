package com.matrix.jayesh.inheritance;

public class Superclass extends SuperClassNext {
    // base class or a parent class.

    int rollNo = 10;
    String str = "jayesh";
    public void display() {
        System.out.println("No data");
    }

    public int displayRollNo(){
        return rollNo;
    }

    public String getStr() {
        return str;
    }
}
