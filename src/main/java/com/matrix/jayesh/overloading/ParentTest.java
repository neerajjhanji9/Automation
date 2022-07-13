package com.matrix.jayesh.overloading;

public class ParentTest {

    int c = 0;

    public static void main(String[] args) {

    }

    public void subStract(){
        System.out.println("Out put is 0");
    }

    public void subStract(int i, int j){
        c = i + j;
        System.out.println("Out put "+c);
    }

    public void subStract(int i, int j, int k){
        c = i+j+k;
        System.out.println("Out put "+c);
    }

    public double subStract(double i, double j, double k){
        double n = i+j+k;
        return n;
    }
}
