package com.matrix.amita.corejava.MethodsPractice;

public class AllVarialesInOne {

    static int staticvariable = 50;

    int instancevariable = 40;

    void someMethod(){
        int localvariable = 30;
    }

    public static void main(String[] args) {
        AllVarialesInOne obj = new AllVarialesInOne();
        System.out.println(obj.instancevariable);
        System.out.println(AllVarialesInOne.staticvariable);
    }
}
