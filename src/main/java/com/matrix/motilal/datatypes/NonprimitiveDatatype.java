package com.matrix.motilal.datatypes;

public class NonprimitiveDatatype {
    public static void main(String[] args) {
         int arr[]={33,3,4,5};//declaration, instantiation and initialization

        int a[]=new int[5];//declaration and instantiation
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
        //traversing array
        for(int i=0;i<a.length;i++)//length is the property of array
            System.out.println(a[i]);
        System.out.println("______________");
        for(int a2:arr)
            System.out.println(a2);

    }
}
