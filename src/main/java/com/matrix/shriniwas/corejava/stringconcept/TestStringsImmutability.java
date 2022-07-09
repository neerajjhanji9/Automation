package com.matrix.shriniwas.corejava.stringconcept;

public class TestStringsImmutability {

    public static void main(String[] args) {

        String str = "Shri";
        str = str.concat("Niwas"); // ShriNiwas -> str
        System.out.println(str);

        StringBuffer strB = new StringBuffer("Alle");
        strB.append("Niwas");
        System.out.println(strB);
    }

}
