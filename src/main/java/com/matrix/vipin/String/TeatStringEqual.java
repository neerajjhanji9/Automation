package com.matrix.vipin.String;

public class TeatStringEqual {

    public static void main(String[] args) {

        String str1 = new String("vipin");
        String str2 = new String("vipin");
        String str3 = new String("vipin");
        System.out.println(str1.equals(str2));//it does the content comparison.
        System.out.println(str1.equals(str3));

        String str4 = "James";
        String str5 = "James";
        String str6 = "James";
        System.out.println(str4.equals(str5));
        System.out.println(str4.equals(str6));


    }
}
