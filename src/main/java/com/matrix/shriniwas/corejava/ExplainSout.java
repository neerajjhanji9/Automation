package com.matrix.shriniwas.corejava;

public class ExplainSout {

    public static String str = "Shriniwas";

    public void getLength() {
        System.out.println(ExplainSout.str.length());

        // ExplainSout.str.length()
        // ExplainSout : Class name
        // str : static variable
        // length() : Method present in String class
    }

    public static void main(String[] args) {
        // System.out.println();
        // System : class name
        // out : out is a static variable of type PrintStream
        // println() : println() is a method present in PrintStream class

        ExplainSout obj = new ExplainSout();
        obj.getLength();
        System.out.println();
    }

}
