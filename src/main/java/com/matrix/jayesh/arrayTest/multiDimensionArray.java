package com.matrix.jayesh.arrayTest;

public class multiDimensionArray {
    public static void main(String[] args) {

        //default the capacity of Arraylist is 10

        int[][] arr=new int[2][2];
        arr[0][0]=1;
        arr[0][1]=2;

        arr[1][0]=3;
        arr[1][1]=4;

        System.out.print(arr[0][0]);
        System.out.print(arr[0][1]);
        System.out.print(arr[1][0]);
        System.out.print(arr[1][1]);
        System.out.println();
        System.out.println("************************************************");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
