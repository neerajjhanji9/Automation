package com.matrix.dhanshri.corejava.polymorphism.overloading;

public class Overloading5 {

    public int m1(String a){   // We cannot overload same parameters int=int, we can overload with different parameters
        return 10;
    }

    public String m1(int a){
        return "";
    }
    public static void main(String[] args) {

    }
}
