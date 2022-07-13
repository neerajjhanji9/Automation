package com.matrix.amita.corejava.String;

public class String1 {

    public static void main(String[] args) {
        //by using object way
        String str1  = new String("Amita");
        String str2  = new String("Lavanya");
        String str3  = new String("Rajendra");
        String str4  = new String("Amita");
        System.out.println(str1 == str4);

        //by using String Literal
        String str5 = "Shriniwas";
        String str6 = "Shriniwas";
        String str7 = "Nayana";
        String str8 = "Anjali";
        System.out.println(str5 == str6);
    }
}
