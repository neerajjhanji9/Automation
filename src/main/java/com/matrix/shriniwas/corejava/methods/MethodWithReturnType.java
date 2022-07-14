package com.matrix.shriniwas.corejava.methods;

public class MethodWithReturnType {

    public int getAddition() {
        int a = 100;
        int b = 200;
        int c = a + b;
        return c; // getAddition() = 300;
    }

    public String getName() {
        String name = "Shriniwas";
        return name;
    }

    public boolean isValid() {
        return true;
    }

    public int doAddition(int a, int b) {
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj = new MethodWithReturnType();
        int i = obj.getAddition();
        System.out.println(i);

        System.out.println("----------------");

        String str = obj.getName();
        System.out.println(str);

        System.out.println("----------------");

        boolean b = obj.isValid();
        System.out.println(b);

        int a = obj.doAddition(100,200);
        System.out.println("Addition is: " +a);
    }
}
