package com.matrix.gayathri.constructors;

public class CopyConstructor {
    int a;
    int b;

    public CopyConstructor(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }
    public CopyConstructor(CopyConstructor obj){
        a = obj.a;
        b = obj.b;
        System.out.println(a + "," + b);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(10,20);
        CopyConstructor obj2 = new CopyConstructor(obj1);

    }
}
