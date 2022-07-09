package com.matrix.amitb.corejava.variables;

public class InstanceVeriables {

    int age = 10;
    String str = "Amit";
    int [] arr = {10,20};
    boolean b = true;

    public void m1() {

        System.out.println(age);
    }

    //Instance Method
    public void m2() {
        //instance area

        System.out.println(age);
    }
    // Static Method

    public static void main (String[] args) {


        InstanceVeriables obj = new InstanceVeriables();
        System.out.println(obj.age);
    }

    }


