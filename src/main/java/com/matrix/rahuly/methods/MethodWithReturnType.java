package com.matrix.rahuly.methods;

public class MethodWithReturnType {

    public int getData() {
        int a = 60;
        int b = 17;
        int c = a + b;
        return c;
    }

    public String getName() {
        String S = "Rahul";
        return S;
    }

    public int addition(int a, int b) {
        int c = a/b;
        return c;
    }

    public boolean isValid() {
        boolean b = false;
        return b;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj = new MethodWithReturnType();
        int i = obj.getData();
        System.out.println(i);

        String s = obj.getName();
        System.out.println(s);

        int l = obj.addition(30, 3);
        System.out.println(l);

        boolean b = obj.isValid();
        System.out.println(b);

    }
}
