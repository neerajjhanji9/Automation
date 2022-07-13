package com.matrix.vinaya.corejava.variables;

import java.util.IdentityHashMap;

public class LocalVariables {

    // methods
    public void getData() {
        // code ,logic

    }

    // Constructor
    public LocalVariables() {
        int c = 20;
        String str = "vinaya";
        //int arr[] = {1, 2, 3, 4};
        //char ch[] = {'g', 'a', 'u', 'r', 'a', 'v'};
        int age = 30;
        System.out.println(age);
        //System.out.println(ch);
    }

    // block
    {
        int c = 30;
        System.out.println(c);
    }

    public void getDetails(int id){
        //local variable with parameter

        int rollNumber = 1;
        System.out.println(rollNumber);
        System.out.println(id);

    }
    public static void main(String[] args) {
        // local variables
        int a = 10;
        int b = 20;
        System.out.println(a+b);

    }


}
