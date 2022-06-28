package com.matrix.amita.corejava.Methods;

public class MethodWithLocalVariablePriority {

    int a = 25;
    int b = 20;
    public void add(int a, int b) {
        System.out.println(a+b); // it is taking from local variable
        System.out.println(this.a+b);
        System.out.println(a+this.b);
        System.out.println(this.a+this.b); //it is taking from instance variable
    }

    public static void main(String[] args) {
        MethodWithLocalVariablePriority obj = new MethodWithLocalVariablePriority();
        obj.add(10, 12);
    }

}