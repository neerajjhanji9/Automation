package com.matrix.mohita.stringconcept;

public class StringMethod1 {
    public static void main(String[] args) {

        // 1. Length() method
        String st1 = "Shri";
        System.out.println("length() method : " + st1 .length());

        // length variable for array
        char [] ch = { 'm','o','h','i','t','a'};
        System.out.println( "length of char array is : "+ ch.length);
        String [] st = new String[]{"Ayan", "Agni", "Nancy"};
        System.out.println("length of string array is : "+ st.length);

        // 2. toLowerCase()
        String st2 = "MONIKA";
        System.out.println("toLowercase() : "+ st2.toLowerCase());

        // 3. toUpperCase()
        String st3 = "vir";
        System.out.println("toUpperCase :" + st3. toUpperCase());

        // 4. trim()
        String st4 = "   Monika Gupta   ";
        System.out.println("trim() : " + st4. trim());

        // 5. equals()
        String st5 = "Ayan";
        String st6 = "Kavya";
        System.out.println(false);      // false
        System.out.println(false);       // true

        // 6. startsWith()
        System.out.println(true);      // true
        System.out.println(false);// true

        // 7. endsWith()
        System.out.println(false);    // false
        System.out.println(false);    // true

        // 8. contains()
        System.out.println(true);      // true
        System.out.println(true);        // true

        // 9. replace()
        System.out.println(st4.replace(' ',';'));   //;;;Mohita;;Gupta;;;;
        System.out.println(st5.replace('a','i'));
        System.out.println(st4 .replace("Juhi","Dino"));

        // 10. indexOf()
        String st7 = "AshishKumarGupta";
        System.out.println(st7.indexOf('1'));        //3
        System.out.println(st7.indexOf("Kumar"));    //4

        //11. lastIndexOf()
        System.out.println(st7.lastIndexOf('1'));   //12
        String st8 = "kinder joy";
        System.out.println(st8 .lastIndexOf("ch"));  //6

        //12. isEmpty()
        System.out.println(false);     // false

        //13. substring()
        System.out.println(st7.substring(9));  //Gupta
        System.out.println(st7.substring(4,8));          //kum
        System.out.println(st7.substring(0,9));          //AshishKumar

        //14.toCharArray
        // using for loop
        char [] st7Char = st7. toCharArray();
        for (int i = 0; i <= 13; i++){
            System.out.print(st7Char[i]);
        }
        System.out.println();
        //for each loop for char
        for (char ch1 : st7Char){
            System.out.println(ch1);
        }
        System.out.println();
        // for each loop for string
        String[] stArr = {"Ashish","Monika","Ashima"};
        for (String str:stArr) {
            System.out.println(str);
        }
        System.out.println();
        //15. split()
        // using for each loop
        String [] s = st8.split(" ");    // st8 = {"kinder">- [0], "joy" >-[1]}
        for (String a:s){
            System.out.println(a);
        }
        // using for loop
        for (int i = 0; i<=1; i++){
            System.out.println(s[i]);
        }
        String st9 = "java;practice;session";
        String [] a = st9.split(";");
        for (String value : a) {
            System.out.println(value);
        }
        //16. replaceAll()
        System.out.println(st9.replaceAll(";session"," "));
    }
}
