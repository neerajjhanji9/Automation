package com.matrix.motilal.variables;



public class TypesOfVariables {
    static int m;//static variable
    void method() //instance method
    {
        int n=90;//local variable
        m=100;
        System.out.println(m);
        System.out.println(n);
    }
    public static void main(String args[])
    {
        int data=50;//instance variable
        System.out.println(data);
        System.out.println(m);
        TypesOfVariables l=new TypesOfVariables();
        l.method();
        System.out.println(l.m);
        System.out.println(TypesOfVariables.m);

    }
}
