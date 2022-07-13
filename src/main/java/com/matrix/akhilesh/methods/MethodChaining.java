package com.matrix.akhilesh.methods;

public class MethodChaining {

    public static void main(String[] args) {
        MethodChaining m2 = new MethodChaining();
        m2.m1(10,20);
    }

    public void m1(int a,int b){
        System.out.println(a+b);
        m2();
    }

    public void m2(){
        int[] a = {10, 20, 30};

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
