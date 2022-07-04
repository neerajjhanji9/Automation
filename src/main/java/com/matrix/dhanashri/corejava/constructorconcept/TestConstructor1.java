package com.matrix.dhanashri.corejava.constructorconcept;

public class TestConstructor1 {

    public void getData(){
        int a=10;
        int b=20;
        int c= a+b;
        System.out.println("Addition of a and b are: "    + c);
    }
    public static void main(String[] args) {
        TestConstructor1 obj= new TestConstructor1();
        obj.getData();

    }
}
