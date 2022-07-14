package com.matrix.jayesh.dataType;

public class DataType {
    public static void main(String[] args) {
        // instance veriable

        //int default 0 size 1 byte
        int i=10;

        System.out.println(i);

        // convert to double
        double KK = i;

        System.out.println(KK);

        // boolean default false site 1 bit
        boolean conditionTrue = true;
        boolean conditionFalse = false;

        // default os /  u000 size 2 byte
        char chat = 'J';

        // default is 0l size 8 byte
        long longveri = 3l;

        // default is 0.0f size 4 byte
        float flovert = 3.0f;

        // default 0.0d size 8 byte
        double dubver = 0.0d;

        // conversion #Narrowing
        int b = (int) dubver;
        System.out.println(b);

        int k= (int) flovert;
        System.out.println(k);
    }
}
