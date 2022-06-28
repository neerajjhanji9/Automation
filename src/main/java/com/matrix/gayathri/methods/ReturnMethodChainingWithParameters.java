package com.matrix.gayathri.methods;

public class ReturnMethodChainingWithParameters {

    int a = 11;
    int b = 22;
    int c = 33;

    public int data(int a, int b, int c){
        info("my","name");
        int d = (a * this.b * c * this.a);
        return d;
    }
    public String info(String s, String st){
        String name = s + st;
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {
        ReturnMethodChainingWithParameters obj = new ReturnMethodChainingWithParameters();
        int da = obj.data(10,20,30);
        System.out.println(da);

    }
}
