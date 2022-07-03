package com.matrix.motilal.datatypes;

public class PrimitiveDatatype {
        static boolean b ; //1 bit
          static   char ch;    //2 bit
           static byte bt;    //1 bit
           static short s;    //2 bit
           static int a;      //4 bit
           static long l;     //8 bit
           static float f;    //4 bit
            static double d;   //8 bit
    public static void main(String[] args) {
       boolean b1 = true ; //1 bit
        char ch1 = 'M';    //2 bit
        byte bt1 = 1;    //1 bit
        short s1 = 2;    //2 bit
        int a1 = 3;      //4 bit
        long l1 =4;     //8 bit
        float f1=5.0f;    //4 bit
        double d1=6.0d;   //8 bit
        System.out.println("Default values :");
        System.out.println( b + " " + ch);
        System.out.println(bt + " "+ s + " "+ a+" "+l);
        System.out.println(f+" "+d);
        System.out.println("______________");
        System.out.println("Local variables :");
        System.out.println( b1+ " " + ch1);
        System.out.println(bt1 + " "+ s1 + " "+ a1+" "+l1);
        System.out.println(f1+" "+d1);


    }
}
