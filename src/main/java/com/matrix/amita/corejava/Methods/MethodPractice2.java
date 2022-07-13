package com.matrix.amita.corejava.Methods;

public class MethodPractice2 {

    public void getData(){
        System.out.println("Hello Amita, Welcome to learn Methods");
    }

    public static void getInfo(){
        System.out.println("Hello Shri, start to learn Methods");
    }

    public static void main(String[] args) {
        MethodPractice2 obj  = new MethodPractice2();
        obj.getData();
        obj.getInfo();              // by using obj reference
        getInfo();                  // Direct call
        MethodPractice2.getInfo();  // by using clas name
    }
}
