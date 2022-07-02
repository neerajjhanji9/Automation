package com.matrix.dhanashri.corejava.MethodsConcept;

public class MethodWithReturnType {

    public int getAddition(){
        int a=100;
        int b=200;
        int c= a+b;
        return c;
    }

    public int getMultiply(){
        int a= 20;
        int b= 10;
        int c= a*b;
        return c;
    }
    public String getName(){
        String name= "Dhanashri";
        return name;
    }

    public boolean isVaild(){
        boolean b= true;
        return b;
    }

    public static void main(String[] args) {
        MethodWithReturnType obj= new MethodWithReturnType();
        int i= obj.getAddition();
        System.out.println(i);

        String s= obj.getName();
        System.out.println(s);

        Boolean b= obj.isVaild();
        System.out.println(b);

        int i1= obj.getMultiply();
        System.out.println(i1);




    }
}
