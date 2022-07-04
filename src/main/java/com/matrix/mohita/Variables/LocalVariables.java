package com.matrix.mohita.Variables;

public class LocalVariables {

    //Method
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        LocalVariables obj = new LocalVariables();
    obj.getDetails(24);

    }

    //Constructor
    public LocalVariables(){
        char ch = 'M';
        String s = "Mahi";
        System.out.println(ch);
        System.out.println(s);
    }
 // Block
 static {
 int num = 90;
     System.out.println(num);


 }

public void getDetails(int age){
    int data = 16;
    System.out.println(data);
    System.out.println(age);
    }
}