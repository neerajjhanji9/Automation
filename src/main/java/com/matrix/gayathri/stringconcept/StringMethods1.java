package com.matrix.gayathri.stringconcept;

public class StringMethods1 {

    public static void main(String[] args) {

        // 1. length() method
        String st1 = "Kavya";
        System.out.println("length() method : " + st1.length());

        // length variable for array
        char[] ch = {'l', 'a', 'k', 's', 'h', 'm', 'i'};
        String[] st = {"Anil", "Gayathri", "Ayaansh"};
        System.out.println("length of char array is : " + ch.length);
        System.out.println("length of string array is : " + st.length);

        // 2. toLowerCase()
        String st2 = "GAYATHRI";
        System.out.println("toLowerCase() : " + st2.toLowerCase());

        // 3. toUpperCase()
        String st3 = "ayaansh";
        System.out.println("toUpperCase : " + st3.toUpperCase());

        // 4. trim()
        String st4 = "   Gayathri  Arangi    ";
        System.out.println("trim() : " + st4.trim());

        // 5. equals()
        String st5 = "Ayaansh";
        String st6 = "Kavya";
        System.out.println(st5.equals(st3));       //false
        System.out.println(st6.equals(st1));       //true

        // 6.startsWith()
        System.out.println(st4.startsWith(" "));    //true
        System.out.println(st5.startsWith("Ayaan"));//true

        // 7.endsWith()
        System.out.println(st2.endsWith("hri"));   //false
        System.out.println(st3.endsWith("ansh"));  //true

        //8.contains()
        System.out.println(st5.contains("an"));   //true
        System.out.println(st4.contains(" "));     //true

        //9.replace()
        System.out.println(st4.replace(' ', ';'));   //;;;Gayathri;;Arangi;;;;
        System.out.println(st5.replace('a', 'i'));
        System.out.println(st4.replace("Arangi", "Anil"));

        //10.indexOf()
        String st7 = "AnilKumarJallu";
        System.out.println(st7.indexOf('l'));        //3
        System.out.println(st7.indexOf("Kumar"));    //4

        //11.lastIndexOf()
        System.out.println(st7.lastIndexOf('l')); //12
        String st8 = "choco chips";
        System.out.println(st8.lastIndexOf("ch")); //6

        //12.isEmpty()
        System.out.println(st8.isEmpty()); //false

        //13.substring()
        System.out.println(st7.substring(9));  //Jallu
        System.out.println(st7.substring(4, 8));         //kuma
        System.out.println(st7.substring(0, 9));         //AnilKumar

        //14.toCharArray
        // using for loop
        char[] st7Char = st7.toCharArray();
        for (int i = 0; i <= 13; i++) {
            System.out.print(st7Char[i]);
        }
        System.out.println();
        // for each loop for char
        for (char ch1: st7Char) {
            System.out.print(ch1);
        }
        System.out.println();
        // for each loop for string
        String[] stArr = {"Anil"," Gayathri"," Ayaansh"};
        for (String str:stArr) {
            System.out.print(str);
        }
        System.out.println();
        //15.split()
        // using for each loop
       String [] s = st8.split(" ");   // st8 = {"choco">- [0], "chips" >-[1]}
        for (String a:s){
            System.out.println(a);
        }
        // using for loop
        for ( int i = 0; i<=1; i++){
            System.out.println(s[i]);
        }
        String st9 = "java;practice;session";
        String []  a = st9.split(";");
        for(int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }
        //16.replaceAll()
        System.out.println(st9.replaceAll(";session"," "));
    }
}