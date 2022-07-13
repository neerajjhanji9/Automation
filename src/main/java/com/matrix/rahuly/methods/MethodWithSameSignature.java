package com.matrix.rahuly.methods;

public class MethodWithSameSignature {

    public void getData(String s1) {
        System.out.println(s1);
    }

    public void getData(char ch) {
        System.out.println(ch);
    }

    public void getInfo(int a, int b, boolean c) {
        System.out.println(a == b);
        System.out.println(c);
    }

    public void getClass(int a, int b, boolean c) {
        System.out.println(a + b);
        System.out.println(c);

    }

    public static void main(String[] args) {
        MethodWithSameSignature m1 = new MethodWithSameSignature();
        m1.getData("Rahul");
        m1.getData('N');
        m1.getInfo(10, 20, true);
        m1.getClass(14, 5, false);

    }

}
