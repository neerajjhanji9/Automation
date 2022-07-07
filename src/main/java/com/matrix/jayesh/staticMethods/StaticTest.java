package com.matrix.jayesh.staticMethods;

public class StaticTest {
    // static veriable
    //this and super cannot be used in static context.

    static String userName = "Jayesh";

    static void getSet(){
        System.out.println("Test for static method");
    }

    static void fabonisis(){
        int n=0,n1=1,n2;
        System.out.print(""+n+""+n1);
        for (int i=0; i<=5; i++){
            n2=n+n1;
            System.out.print(n2);
            n=n1;
            n1=n2;
        }
    }
    public static void main(String[] args) {
        System.out.println(userName);
        getSet(); // call static method

        fabonisis();
    }
}
