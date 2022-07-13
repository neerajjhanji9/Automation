package com.matrix.vipin.methods;

public class TeatMethod1 {

    //method declaration
    public void getData(){
        //Method implementation
        System.out.println("i am in get data method");

    }
    //Static method declaration
    public static void getInfo() {
        // Static method implementation
        System.out.println("i am in getInfo method");

    }

    public static void main(String[] args) {
        TeatMethod1 obj = new TeatMethod1();
        obj.getData();//method calling
       // obj.getInfo();//static method calling

        getInfo();
        TeatMethod1.getInfo();
    }
}
