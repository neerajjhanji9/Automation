package com.matrix.motilal.methods;

public class AbstractMethodImplementation extends AbstractMethod{

    @Override
    void m1() {
        System.out.println("From AbstractMethodImplementation class");
    }

    public static void main(String[] args) {
        AbstractMethod am=new AbstractMethodImplementation();
        am.m1();
    }
}
