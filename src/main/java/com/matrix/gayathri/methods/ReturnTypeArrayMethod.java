package com.matrix.gayathri.methods;

public class ReturnTypeArrayMethod {
    public void getArrayDetails(int [] ar) {

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);}

    }
    public int[] getData(int[] ar){
        return ar;

    }

    public static void main(String[] args) {
        ReturnTypeArrayMethod obj =new ReturnTypeArrayMethod();
        int [] ar = {80,89,90};
        obj.getArrayDetails(ar);
        int [] a = obj.getData(ar);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);}

    }




}

