package com.matrix.rahuly;

public class LocalVariables {

    int age;
    String nm;

    //Method
    public void getData() {
        int a = 12;
        int b = 15;
        System.out.println(a+b);
        System.out.println(age);
        System.out.println(nm);

    }
    //Constructor
    public LocalVariables(int no, String nn){
        age = no;
        nm = nn;
        int e = 5;
        int d = 6;
        int f = (e+d);
        System.out.println(f);
    }

    public static void main(String[] args) {
        LocalVariables L1 = new LocalVariables(25, "Rahul");
        L1.getData();
        LocalVariables L2 = new LocalVariables(24, "Nishi");
        L2.getData();
    }
}
