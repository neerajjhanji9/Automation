package com.matrix.amita.corejava.Methods;

public class MethodWithClassParameter{

    public void getInfo(){
        MethodStudent o = new MethodStudent();
        System.out.println(o.name);
        System.out.println(o.College);
        System.out.println(o.age);
    }

    public static void main(String[] args) {
        MethodWithClassParameter obj = new MethodWithClassParameter();
        obj.getInfo();
    }
}
