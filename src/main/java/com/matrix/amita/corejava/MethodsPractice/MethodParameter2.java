package com.matrix.amita.corejava.MethodsPractice;

public class MethodParameter2 {

    public void display1(){
        System.out.println("Method Without Parameter");
    }

    public void display2(int a){
        System.out.println("Method with Parameter:" + a);
    }

    public static void main(String[] args) {
        MethodParameter2 obj=new MethodParameter2();
        obj.display1();
        obj.display2(58);
    }
}


