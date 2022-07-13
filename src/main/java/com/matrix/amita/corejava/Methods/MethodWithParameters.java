package com.matrix.amita.corejava.Methods;

import javax.imageio.stream.ImageInputStream;

public class MethodWithParameters {

    public void addition(int a, int b) {
        System.out.println(a+b);
    }

    public void multiply(int a, int b) {
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        MethodWithParameters obj = new MethodWithParameters();
        obj.addition(20, 50);
        obj.multiply(10, 15);
    }
}