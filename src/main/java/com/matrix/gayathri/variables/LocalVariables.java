package com.matrix.gayathri.variables;

public class LocalVariables {

    //Method
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        LocalVariables obj = new LocalVariables();
        obj.getDetails(24);

    }

  // Constructor
      public LocalVariables() {
        int age =15;
        char ch = 'G';
        String s = "Gayathri";
        System.out.println(ch);
          System.out.println(s);
        }
   // Block
   {
       int num = 90;
       System.out.println(num);


   }

       public void getDetails(int age) {
        int data = 16;
       System.out.println(data);
       System.out.println(age);
   }


    }



