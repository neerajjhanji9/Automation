package com.matrix.amitb.corejava.methods;

public class MethodChainingAddition {

    public void add1(){
        int a =5;
        int b =10;
        System.out.println(a+b);
    }

    public void add2(){
        add1();
        int x = 10;
        int y = 15;
        System.out.println(x+y);
    }

    public void getDetails(){
        add2();
        int i =20;
        int j =5;
        System.out.println(i*j);
        getInfo();
    }

    public void getInfo(){

        String str = "I am Amit";
        System.out.println(str);
    }

    public static void main(String[] args) {
        MethodChainingAddition obj = new MethodChainingAddition();
        obj.getDetails();
    }
}
