package com.matrix.juhi.variablesp;

//Instances variables are present inside class but outside methods

public class InstanceV {

    int age = 27;
    String b = "Juhi";

     //Instance Method has Direct access to Instance variable
     public void callName(){
         System.out.println(b);
     }

     //Static method has indirect access to Instance Variable (by object refernce)
     public static void main (String [] args){
         InstanceV c = new InstanceV();
         System.out.println(c.age);
         c.callName();
     }
}

