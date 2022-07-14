package com.matrix.dhanshri.corejava.stringconcept;

public class Immutable {
    public static void main(String[] args) {
        String str= "Dhan";
        str=str.concat("shri");

        str.concat("shri");
        System.out.println(str);

        StringBuffer str1= new StringBuffer("Bhosale");
        str1.append("Mahadev");
        System.out.println(str1);
    }
}
