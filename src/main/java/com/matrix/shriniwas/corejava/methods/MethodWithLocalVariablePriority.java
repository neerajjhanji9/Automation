package com.matrix.shriniwas.corejava.methods;

public class MethodWithLocalVariablePriority {

    int a; // 10
    int b; // 20

                     // 10     20
    public void add(int a, int b) {
        System.out.println(a+b); // 30
        System.out.println(this.a + this.b); // 300 : this is keyword which refers to current class instance(methods, variables, constructor)
        System.out.println(a + this.b); // 210 : 10 + 200
        this.a = a; // a = 10
        this.b = b; // b = 20
    }

    public void getData() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        MethodWithLocalVariablePriority obj = new MethodWithLocalVariablePriority();
        obj.add(10, 20);
        obj.getData();
    }
}
