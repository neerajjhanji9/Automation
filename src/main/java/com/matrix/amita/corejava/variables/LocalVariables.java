package com.matrix.amita.corejava.variables;

public class LocalVariables {

    public static void main(String[] args) {
        // local variable
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

     // method
    public void getdata(){
        // some code
    }

    //constructor
    LocalVariables(){
        int a = 50;
        System.out.println(a);
    }

    // blocks
    {
        int b = 20;
        System.out.println(b);
    }
}
