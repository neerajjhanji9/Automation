package com.matrix.akhilesh.methods;

public class MethodWithReturnTypeArray {

    public static void main(String[] args) {
        int [] arr_elements = {10,20,30,40,50};

        MethodWithReturnTypeArray rt = new MethodWithReturnTypeArray();
        rt.getArrayDetails(arr_elements);
        System.out.println("-------------------------");

        int [] a = rt.arrayData(arr_elements);

        for (int i=0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public void getArrayDetails(int [] arr){
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public int [] arrayData(int [] arr){
        return arr;
    }
}
