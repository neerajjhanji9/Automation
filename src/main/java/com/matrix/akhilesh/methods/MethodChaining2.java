package com.matrix.akhilesh.methods;

public class MethodChaining2 {

    int rollNo = 25;
    String str = "Akhilesh";

    public static void main(String[] args) {
        MethodChaining2 obj = new MethodChaining2();
        obj.m2();
    }

    public void m1(String str){
        System.out.println(str);
    }

    public void m2(){
        System.out.println("My name is " + str + " and my age is " + rollNo);
        m1("Rahul");
    }

}
