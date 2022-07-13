package com.matrix.gayathri.methods;

public class MethodChaining2 {

    public void m1() {
        System.out.println("Alphabet is a set of letters which are :");
        m3();
    }

    public void m2() {
        System.out.println("Now Join words to make sentences.");

    }

    public void m3() {
        int a = 26;
        System.out.println(a);
        System.out.println("Using letters make words,");
        m2();

    }

    public static void main(String[] args) {
        System.out.println("English is fun!");
        MethodChaining2 obj = new MethodChaining2();
        obj.m1();

    }


}
