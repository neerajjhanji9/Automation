package com.matrix.pankaj.variables;

import com.matrix.shriniwas.corejava.variables.LocalVariables;

public class LocalVariableNew {

    LocalVariableNew(){
        System.out.println("I AM IN CONSTRUCTOR");

    }
    {
        System.out.println("I AM IN BLOCK");

    }

    public static void main(String[] args) {
        new LocalVariableNew ();

        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(a+b);

    }
}
