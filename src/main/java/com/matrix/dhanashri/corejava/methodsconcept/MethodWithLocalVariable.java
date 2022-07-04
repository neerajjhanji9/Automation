package com.matrix.dhanashri.corejava.methodsconcept;

public class MethodWithLocalVariable {

    int a=100;
    int b=200;

    public void add(int a, int b){
        System.out.println(a+b);
        System.out.println(this.a+this.b);
        System.out.println(a+this.b);
        this.a=a;
        this.b=b;
    }

    public void getData(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        MethodWithLocalVariable mv= new MethodWithLocalVariable();
        mv.add(20, 30);
        mv.getData();
    }

}
