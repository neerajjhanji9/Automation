package com.matrix.kishor.corejava.stringconcept;

public class StringMethods {

    public static void main(String[] args) {
        String str = "Kishor";
        System.out.println("Length()"+str.length());//count of char in string

        char [] c = {'a','b'};
        System.out.println(c.length);//length or element of array

        System.out.println("Upper cases"+str.toUpperCase());
        System.out.println("Lower cases"+str.toLowerCase());

        String str1 = "       hi       how     are   you      ";
        System.out.println("Trim starting and ending spaces"+str1.trim());
    }
}
