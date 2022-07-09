package com.matrix.madhura.stringMethods;

import java.util.Locale;

public class TestStringMethods {
    public static void main(String[] args) {
         String str1 ="narendra";
         System.out.println("Lenghth of str1 :" +str1.length());

         char  [] ch = {'a', 'b', 'c' , 'd'};
         String []str2= {"madhu" , "narendra"};

        System.out.println("lenghth of char arrys:" +ch.length);
        System.out.println("Lenghth of String arrys :" +str2.length);

        String str3 ="madhura";
        String  str4= "NARENDRA";
        String  str5 ="         Madhura Narendra Nandaigari          ";

        System.out.println("Converted into UpperCase : " +str3.toUpperCase());
        System.out.println("Converted into Lower case : " +str4.toLowerCase());
        System.out.println("Deleting starting and Ending speces :" +str5.trim());

        String str6 = "Laddu";
        String  str7 = "Laddu";

        System.out.println("Equals() :" +str6.equals(str7));



    }
}
