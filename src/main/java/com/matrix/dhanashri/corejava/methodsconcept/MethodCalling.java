package com.matrix.dhanashri.corejava.methodsconcept;

public class MethodCalling {

    public void getData(){
        System.out.println("I am in getData Method");
    }

    public static void getInfo(){
        System.out.println("I am in getInfo Method");
    }

    public static void main(String[] args) {
        MethodCalling mc= new MethodCalling();
        mc.getData();
        mc.getInfo();
        MethodCalling.getInfo();
        //MethodCalling.getData();

    }
}
