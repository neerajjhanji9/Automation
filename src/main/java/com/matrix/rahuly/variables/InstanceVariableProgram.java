package com.matrix.rahuly.variables;

import java.util.Arrays;

public class InstanceVariableProgram {

    int a = 20;
    int b = 30;

    public void getData() {

        System.out.println(a+b);
    }
    public void getInfo() {
        int e = 10;
        int f = 6;
        System.out.println(e-f);
    }

    public static void getData1() {
        String s = "Rahul";
        int [] r = {100, 200, 300};
        char [] ch = {'R', 'V', 'W'};
        boolean i = true;

        System.out.println(s);
        System.out.println(Arrays.toString(r));
        System.out.println(ch);
        System.out.println(i);

    }
    public static void main(String[] args) {
        int c = 5;
        int d = 6;

        InstanceVariableProgram obj = new InstanceVariableProgram();

        System.out.println(obj.a + obj.b); //obj.getData(); - Another way for output.
        obj.getInfo();
        getData1();
        System.out.println(c-d);
    }
}
