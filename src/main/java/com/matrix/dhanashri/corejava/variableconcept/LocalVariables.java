package com.matrix.dhanashri.corejava.variableconcept;

public class LocalVariables {
    /*public static void main(String[] args) {
        int a=20;
        System.out.println(a);*/

    //method

    public void getData(){
    }

    LocalVariables(){
        int age= 30;
        String str="Dhanashri";
        int[] arr= {20, 30};
        System.out.println(age);
        System.out.println(str);
        }

    {
        int b=50;
        System.out.println(b);
    }

    public void getDetails(int age){
        int data=20;
        System.out.println(age);
        System.out.println(data);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(b);
        LocalVariables lo = new LocalVariables();

        lo.getData();
        lo.getDetails(30);

    }
    }

