package com.matrix.rahuly.methods;

public class MethodWithReturnTypeArray {

    public void getArrayData(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int [] getArray(int [] arr){
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {10, 20, 30};

        MethodWithReturnTypeArray obj = new MethodWithReturnTypeArray();
        obj.getArrayData(arr);
        int [] a = obj.getArray(arr);

    }
}

