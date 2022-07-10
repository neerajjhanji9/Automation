package com.matrix.pratap.corejava.variables;

public class LocalVariables {

    // Method
    public void getData(){
        // code, logic
    }

    //Constructor
    public LocalVariables(){
        int b = 20;
        String str = "Pratapsinh";
        int arr [] = {11, 12};
        int age = 30;
        System.out.println(b);
        System.out.println(arr);

    }
     // Block
     {
         int a = 50;
         System.out.println(a);
     }

     public void getDetails(int age){
        // Local Variables
         int data = 33;
         System.out.println(age);
         System.out.println(data);
     }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(a + b);
    }
}
