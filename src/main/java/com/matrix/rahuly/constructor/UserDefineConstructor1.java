package com.matrix.rahuly.constructor;

public class UserDefineConstructor1 {

    int a;
    int b;
    double c;

    public UserDefineConstructor1(){
        a = 10;
        b = 20;
        c = 40.5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public UserDefineConstructor1(int x, int y){
        a = x;
        b = y;
        System.out.println(a);
        System.out.println(b);
    }

    public UserDefineConstructor1(int x, double y) {
        a = x;
        c = y;
        System.out.println(a);
        System.out.println(c);
    }

    public UserDefineConstructor1(int x, int y, double z) {
        a = x;
        b = y;
        c = z;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public static void main(String[] args) {
        new UserDefineConstructor1();
        new UserDefineConstructor1(40,30);
        new UserDefineConstructor1(30, 44.5);
        new UserDefineConstructor1(22, 40, 44.5);

    }
}


