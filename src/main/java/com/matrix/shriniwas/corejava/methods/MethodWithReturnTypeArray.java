package com.matrix.shriniwas.corejava.methods;

public class MethodWithReturnTypeArray {

    public void getArrayData(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int [] getArrayDetails(int [] arr) {
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};

        MethodWithReturnTypeArray obj = new MethodWithReturnTypeArray();
        obj.getArrayData(arr);
        System.out.println("-----------------");

        int [] a = obj.getArrayDetails(arr);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // for loop
        // for each loop
        // while loop

    }

}
