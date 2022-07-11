package com.matrix.ajaykumar.corejava.methods;

public class MethodWithVariablePriority {
    int a=100;
    int b=200;
    public void add(int a,int b){
        System.out.println(a+b);//30
        System.out.println(this.a+this.b);// This is Keyword which refers to current class instance //300
        System.out.println(a+this.b);//210
    }

    public static void main(String[] args) {
        MethodWithVariablePriority obj = new MethodWithVariablePriority();
                obj.add(10,20);
    }
}
