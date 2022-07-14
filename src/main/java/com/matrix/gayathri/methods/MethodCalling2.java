package com.matrix.gayathri.methods;

public class MethodCalling2 {

    public void getData() {
        System.out.println("Hello getData Method!");

    }
    public static void getInfo() {
        System.out.println("Hello getInfo Method!");
    }

    public static void main(String[] args) {
        MethodCalling2 obj= new MethodCalling2();
       // Instance Method Calling
        obj.getData();

        // Static Method Calling
        getInfo();                    // #1. Direct access
        obj.getInfo();                // #2. By Using Object Reference
        MethodCalling2.getInfo();     // #3. By Using Class name
    }



}
