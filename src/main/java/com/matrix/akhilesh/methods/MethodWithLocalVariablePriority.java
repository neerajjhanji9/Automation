package com.matrix.akhilesh.methods;

public class MethodWithLocalVariablePriority {

    int str;

    int str1;

    public void getData(){
        System.out.println(str);
        System.out.println(str1);
    }

    public void add(int a, int b){
        System.out.println(a+b);
        this.str = a;
        this.str1 = b;
    }
    public static void main(String[] args) {
        MethodWithLocalVariablePriority mt = new MethodWithLocalVariablePriority();
        mt.add(10,20);
        mt.getData();
    }
}
