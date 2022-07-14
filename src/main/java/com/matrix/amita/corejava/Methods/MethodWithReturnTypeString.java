package com.matrix.amita.corejava.Methods;

public class MethodWithReturnTypeString {

    public void getname(String str){
        System.out.println(str);
    }

    public static String str1(){
        return str1();
    }

    public static void main(String[] args) {
        String str = "Amita Singam";
        String str1 = "Shrinivas Mandal";
        MethodWithReturnTypeString obj=new MethodWithReturnTypeString();
        obj.getname(str);
        System.out.println("----------------");
        System.out.println(str1);
    }
}
