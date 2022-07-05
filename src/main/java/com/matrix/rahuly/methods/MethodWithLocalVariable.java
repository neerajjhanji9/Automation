package com.matrix.rahuly.methods;

public class MethodWithLocalVariable {

    int a;
    int b;
    String s;

    public void getData(int a, int b, String s1){
        this.a = a;
        this.b = b;
        this.s = s1;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(s1);
        System.out.println(this.b / a);
        System.out.println(a - this.b);
    }

    public void getData1(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println(a - this.b);
        System.out.println(this.b * a);
    }

    public static void main(String[] args){
        MethodWithLocalVariable m1 = new MethodWithLocalVariable();
        m1.getData(10,20,"Rahul");
        m1.getData1(15,10);

    }


}
