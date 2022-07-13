package com.matrix.motilal.methods;

public class MethodWithOrWithoutReturnType {
    public void add()
    {
        int c=10;
        int d=20;
        System.out.println("method without return type ="+(c+d));
    }
    public int add(int a,int b)
    {
        return (a+b);
    }
    public static void main(String[] args) {
        MethodWithOrWithoutReturnType p=new MethodWithOrWithoutReturnType();
        p.add();
        int c=p.add(30,40);
        System.out.println("method with return type = "+c);

    }
}
