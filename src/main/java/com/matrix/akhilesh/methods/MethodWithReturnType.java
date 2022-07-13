package com.matrix.akhilesh.methods;

public class MethodWithReturnType {

    public static void main(String[] args) {
        MethodWithReturnType rt = new MethodWithReturnType();
        int is = rt.add();
        System.out.println(is);

        String s1 = rt.str();
        System.out.println(s1);

        int y = rt.doAdd(14, 20);
        System.out.println(y);
    }

    public int add(){
        int a = 10;
        int b = 20;
        int c = a + b;
        return  c;
    }

    public int doAdd(int a, int b){
        int d = a + b;
        return d;
    }

    public String str(){
        String st = "Akhilesh";
        return st;
    }


}
