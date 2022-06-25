package com.matrix.rahuly;

public class ProgramPractice {


    public static void main(String[] args) {
        // Local variable
        ProgramPractice pt = new ProgramPractice();
        pt.instance3();

    }

    public void instance(int a, int b) {
        System.out.println(a+b);
    }

    public void instance1(){
        int c = 20;
        int d = 10;
        System.out.println(c-d);
    }

    public static void instance4(){
        System.out.println("Hello");
    }

    public  void instance3(){
        instance(10, 2);
        instance1();
        instance4();
        instance5();
    }

    public void instance5(){
        System.out.println("Java Core Practice");
    }

}
