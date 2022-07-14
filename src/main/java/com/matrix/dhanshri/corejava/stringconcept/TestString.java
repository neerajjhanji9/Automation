package com.matrix.dhanshri.corejava.stringconcept;

public class TestString {

    public static void main(String[] args) {

        //by using object way
        String str1= new String("Dhanashri");
        String str2= new String("Renuka");
        String str5= new String("Dhanashri");
        System.out.println("Memory Address of str1:  "     +System.identityHashCode(str1));//This will print memory location of str1
        System.out.println("Memory Address of str2:  "      +System.identityHashCode(str2));//This will print memory location of str2
        System.out.println("Memory Address of str5:  "       +System.identityHashCode(str5));//same as above for str5

        System.out.println("***********************************");
        System.out.println(str1==str5);//false : does Reference comparison
        System.out.println((str1.equals(str5)));

        // by using string literal way
        String str3 = "Dhanashri";
        String str4= "Dhanu";
        String str6="Dhanu";

        System.out.println("*******************************************");
        System.out.println(str3.equals(str4));//false
        System.out.println("******************************************");

        System.out.println(str4.equals(str6)); //  it compares content
        System.out.println(str4==str6);//true   // it compares object reference

        System.out.println("Memory Address of str3:  "     +System.identityHashCode(str3));//This will print memory location of str3
        System.out.println("Memory Address of str4:  "      +System.identityHashCode(str4));//This will print memory location of str4
        System.out.println("Memory Address of str6:  "       +System.identityHashCode(str6));//same as above for str6
    }
}
