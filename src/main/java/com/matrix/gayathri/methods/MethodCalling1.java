package com.matrix.gayathri.methods;

public class MethodCalling1 {

    public void addition() {
        int a = 10;
        int b = 20;
        int c = (a + b);
        System.out.println( "The Sum is : " + c);
    }

    public void addition1() {
        int a = 100;
        int b = 200;
        System.out.println("The Sum is : " + (a + b));
    }

    public static void add(int a, int b){
        System.out.println("The Sum is : "+ (a + b));

    }

    public static void main(String[] args) {
        MethodCalling1 obj =new MethodCalling1();
        obj.addition();
        obj.addition1();
        add(40,60);
    }



}
