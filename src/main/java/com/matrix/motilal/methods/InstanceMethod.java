package com.matrix.motilal.methods;

public class InstanceMethod {
    int s;

    //user-defined method because we have not used static keyword
    public int add(int a, int b) {
        s = a + b;
//returning the sum
        return s;
    }

    public static void main(String[] args) {
        InstanceMethod i=new InstanceMethod();
        int sum=i.add(2,2);
        System.out.println(sum);
    }
}
