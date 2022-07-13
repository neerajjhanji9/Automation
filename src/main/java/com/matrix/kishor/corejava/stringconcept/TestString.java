package com.matrix.kishor.corejava.stringconcept;

public class TestString {

     public static void main(String[] args) {
        String str = "Kishor"; //using string literal
         System.out.println(str);
        String str1 = "Kishor";
         System.out.println(str==str1); //refer same reference address

         System.out.println("Memory of Str1"+System.identityHashCode(str1));
         System.out.println("Memory of Str1"+System.identityHashCode(str));

         String str2 = new String("Kishor Mane");//String Object
         System.out.println(str2);
         String str3 = new String("Kishor Mane");//String Object
         System.out.println(str3);
         System.out.println(str2==str3); //refer the different reference address

         System.out.println("Memory of Str1"+System.identityHashCode(str2));
         System.out.println("Memory of Str1"+System.identityHashCode(str3));

    }
}
