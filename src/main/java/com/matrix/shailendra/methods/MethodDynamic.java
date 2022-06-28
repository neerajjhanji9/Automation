package com.matrix.shailendra.methods;

public class MethodDynamic {
    public void getAddition(int a, int b) {
        int c = a + b;
        System.out.println("Addition value is=" + c);
    }

    public static void main(String[] args) {
        MethodDynamic obj = new MethodDynamic();
        obj.getAddition(17, 24);
    }
}
