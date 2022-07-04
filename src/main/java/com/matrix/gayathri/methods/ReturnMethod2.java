package com.matrix.gayathri.methods;

public class ReturnMethod2 {

    static char c1 = 'A';
    static char c2 ='y';
    static char c3 = 'a';
    static char c4 = 'a';
    static char c5 = 'n';
    static String st1 = "Anil";
    static String st2 = "Gayathri";
    static String st3 = "Ayaansh";


    public  static char[] name() {
        char[] ch = {c1,c2,c3,c4,c5};
        return ch;
    }
    public static String family(){
        String st = st1 + (',') + st2 + (',') + st3;
        return st;
    }

    public static void main(String[] args) {
        char[] ch = name();
        System.out.println(ch);
        System.out.println("-----------");
        String st = family();
        System.out.println(st);
    }

}
