package com.matrix.akhilesh.methods;

public class MethodCalling {

    public static void main(String[] args) {
        MethodCalling m1 = new MethodCalling();
        m1.getdata(); //Method Calling

        getInfo(); //Direct call static method

        MethodCalling.getInfo(); // By using class name
    }

    public void getdata(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    public  static void getInfo(){
        System.out.println("Welcome To Core Selenium");
    }
}
