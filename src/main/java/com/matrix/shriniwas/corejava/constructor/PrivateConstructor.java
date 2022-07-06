package com.matrix.shriniwas.corejava.constructor;

public class PrivateConstructor {

    private PrivateConstructor() {
        System.out.println("I ma in Private Constructor");
    }

    protected PrivateConstructor(int a, int b) {

    }

    /*public static PrivateConstructor(String str) {

    }*/

    public String PrivateConstructor(int rollNo) {
        return "Shriniwas";
    }

    public static void main(String[] args) {
        PrivateConstructor obj = new PrivateConstructor();
        obj.PrivateConstructor(10);
    }

}
