package com.matrix.amita.corejava.constructor;

public class PrivateConstructor {

    private PrivateConstructor(){
        System.out.println("I am accessing Private Constructor");
    }   // it will access only in same class not in another class

    public static void main(String[] args) {
        PrivateConstructor obj=new PrivateConstructor();
    }

}
