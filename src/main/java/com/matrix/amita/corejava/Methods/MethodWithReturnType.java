package com.matrix.amita.corejava.Methods;

public class MethodWithReturnType {

    public int getAddition(){
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    public String getName(){
        String name = "Amita Singam";
        return name;
    }

    public boolean isValid(){
        return true;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj = new MethodWithReturnType();
        int i = obj.getAddition();
        System.out.println(i);

        String str = obj.getName();
        System.out.println(str);

        boolean b = obj.isValid();
        System.out.println(b);
    }
}
