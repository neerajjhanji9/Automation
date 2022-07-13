package com.matrix.ajaykumar.corejava.methods;

public class TestMethod2 {
    //Method Decleration
     int a=100;
    public void getData(){
        //Method Implementation
        System.out.println("I am in getData Method");

    }
    //static Method decleration
    public static void getInfo(){
        //static Method implementation
        System.out.println("I am in getInfo Method");
    }

    public static void main(String[] args) {
        TestMethod2 obj = new TestMethod2();
                obj.getData();//Method calling
        //By using object reference

        obj.getInfo();//static method calling
        System.out.println(obj.a);
    }
}
