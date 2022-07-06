package com.matrix.gayathri.stringconcept;

public class StringMethods1 {

    public static void main(String[] args) {

        // 1. length() method
        String st1 = "Kavya";
        System.out.println("length() method : " + st1.length());

        // length variable for array
        char[] ch = {'l','a','k','s','h','m','i'};
        String [] st = {"Anil","Gayathri","Ayaansh"};
        System.out.println("length of char array is : " + ch.length);
        System.out.println("length of string array is : " + st.length);

        // 2. toLowerCase()
        String st2 = "GAYATHRI";
        System.out.println("toLowerCase() : "+ st2.toLowerCase());

        // 3. toUpperCase()
        String st3 = "ayaansh";
        System.out.println("toUpperCase : " + st3.toUpperCase() );

        // 4. trim()
        String st4 = "   Gayathri  Arangi    ";
        System.out.println("trim() : " + st4.trim());

        // 5. equals()
        String st5 = "Ayaansh";
        String st6 = "Kavya";
        System.out.println(st5.equals(st3));
        System.out.println(st6.equals(st1));

    }
}
