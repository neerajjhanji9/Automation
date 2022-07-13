package com.matrix.shriniwas.corejava.methods;

public class MethodCalling {

    // Method declaration
    public void getData() {
        // Method implementation
        System.out.println("I am in getData method..");
    }

    // Static Method declaration
    public static void getInfo() {
        // Static Method implementation
        System.out.println("I am in getInfo method..");
    }

    public static void main(String[] args) {
        MethodCalling obj = new MethodCalling();
        obj.getData(); // Method calling

        // By using object reference
        obj.getInfo(); // Static method calling

        // Direct call
        getInfo();

        // By using class name
        MethodCalling.getInfo();

    }
}
