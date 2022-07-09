package com.matrix.shriniwas.corejava.stringconcept;

public class TestStringMethods {

    public static void main(String[] args) {
       String str1 = "Shriniwas";
       System.out.println("Length() : " + str1.length());

       char[] ch = {'s', 'h', 'r', 'i'};
       String[] strArr = {"Shri1", "Shri2"};

       System.out.println(ch.length);
       System.out.println(strArr.length);

       String str2 = "SHRINIWAS";
       System.out.println("toLowerCase(): " + str2.toLowerCase());

       System.out.println("toUpperCase(): " + str1.toUpperCase());

       String str3 = "       Shriniwas      Alle       ";
       System.out.println("trim():" + str3.trim());

       String str4 = "Shri";
       String str5 = "shri";
       System.out.println("equals() : " + str4.equals(str5));

       String str6 = "Shriniwas"; // ['S=0,h=1,r=2,i=3,n=4,i=5,w=6,a=7,s=8] '
       System.out.println("startsWith(): " + str6.startsWith("Shri"));
       System.out.println("endsWith(): " + str6.endsWith("was"));
       System.out.println("contains(): " + str6.contains("Sh"));
       System.out.println("replace(char, char): " + str6.replace('w', 'W')); // char, char
       System.out.println("replace(string, string): " + str6.replace("Shriniwas", "Shrini")); // string, string
       System.out.println("indexOf(char):" + str6.indexOf('i'));
       System.out.println("indexOf(string):" + str6.indexOf("was"));
       System.out.println("lastIndexOf(char):" + str6.lastIndexOf('i'));
       System.out.println("isEmpty():" + str6.isEmpty());

       System.out.println("substring(int):" + str6.substring(0));
       System.out.println("substring(int):" + str6.substring(1));
       System.out.println("substring(int):" + str6.substring(7));
       System.out.println("substring(int, int):" + str6.substring(0, 4));
       System.out.println("substring(int, int):" + str6.substring(1, 9));

       char[] chArr = str6.toCharArray(); // string -> char[] , { 'S=0','h=1'..... 's=8'}
       String [] stArr = {"Shri", "niwas", "alle"};

       for ( char chr : chArr) {
          System.out.print(chr + " ");
       }
       System.out.println();
       // for each
       for (String st : stArr) {
          System.out.print(st + " ");
       }
       System.out.println();

       // for loop
       for (int i = 0; i <=8 ;  i++) {
          System.out.println(chArr[i]); // chArr[0], chArr[1], chArr[2]
       }

       String str7 = "Shri,Alle,niwas,automation";

       // Regex: Regular Expression
       String [] strArray = str7.split(",");  // {"Shri=0", "Alle=1", "niwas=2", "automation=3"}
       System.out.println("String Array Length:" +strArray.length);
       System.out.println("----- Using for each loop -----");
       for (String st : strArray) {
          System.out.println(st);
       }

       System.out.println("----- Using For Loop -----");
       for (int i = 0; i < strArray.length; i++) {
          System.out.println(strArray[i]); // strArray[0], strArray[1]
       }


        // ; -> semicolon
        // : -> colon
        // "" : double quotes
        // '' : single quotes
        // !

       String str8= "Shriniwas;;;Alle";
       System.out.println(str8.replaceAll(";", "SHRI"));

    }
}
