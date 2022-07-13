package com.matrix.jayesh.arrayTest;

public class arrayTest {
    // is a collection of similar type of elements
    /**
     * Types of Array in java
     * Single Dimensional Array
     * Multidimensional Array
     *
     */


    public static void main(String[] args) {
        int arr[] = new int[5]; //declaration and instantiation
        arr[0] = 10; //initialization start with 0
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr[2]);

        // iterate an array
        for(int i=0; i<arr.length; i++){
            if(arr[i]!= 0){
                System.out.print(arr[i]);
            }else {
                System.out.print("Error");
            }

        }

        /***************************************************/
        // single diamension array
        int Arr1[] ={50, 20, 30 };  //declaration, initialization and instantiation

        int [] Arr3 ={50, 20, 30 };  //declaration, initialization and instantiation

        System.out.println(Arr1[2]);
        System.out.println(Arr3[2]);

        displayArray2(Arr1); // send array  in method

        // return an array
         int [] array5 = displayArray3();
        System.out.println(array5[1]);
        for (int st1:array5) {
            System.out.print(st1);
        }
    }

    private static int[] displayArray3() {
        int [] array4 = {8, 9, 6, 5};
        return array4;
    }

    static void displayArray2(int[] arr1){
        //System.out.println(arr1); // [I@4554617c display object location.
        for (int st:arr1){
            System.out.print(st);
        }
    }
}
