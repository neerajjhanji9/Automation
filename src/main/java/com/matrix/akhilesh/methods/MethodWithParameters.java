package com.matrix.akhilesh.methods;

public class MethodWithParameters {

    public static void main(String[] args) {
        MethodWithParameters mt = new MethodWithParameters();
        mt.add(15,15);
        mt.multiply(12,23);
        mt.getData("Akhilesh");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void multiply(int c, int d){
        System.out.println(c * d);
    }

    public void getData(String st){
        System.out.println(st);
    }
}
