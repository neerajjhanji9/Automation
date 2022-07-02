package com.matrix.gayathri.methods;

public class MethodWithReturnType {

    public int getAddition(){
        int a = 100;
        int b = 200;
        return (a+b);
    }
    public double multiply(){
        double d1 = 10.5;
        double d2 = 20.5;
        double d3 = 30.5;
        return (d1*d2*d3);
    }
    public boolean display(){
        boolean b1 = true;
        boolean b2 = false;
        return (b1);
    }

    public static void main(String[] args) {
        MethodWithReturnType obj = new MethodWithReturnType();
        int i = obj.getAddition();
        System.out.println(i);
        double d = obj.multiply();
        System.out.println(d);
        boolean b = obj.display();
        System.out.println(b);

    }
}
