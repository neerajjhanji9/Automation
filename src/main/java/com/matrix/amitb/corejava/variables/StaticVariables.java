package com.matrix.amitb.corejava.variables;

public class StaticVariables {
    // StaticVariables

    static int age = 10;

    //InstanceMethod
    public void getData1(){
        //Instance Area
        System.out.println(age);
    }

    //Static Method
     public static void getData2(){

        System.out.println(age);
    }

    public static void main(String[]args){

        System.out.println(StaticVariables.age);
    }
    }
