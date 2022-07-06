package com.matrix.madhura.logicalPrograms;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a=5;
        int b=3;
        System.out.println("Before swapping 1st number :" +a);
        System.out.println("Before swapping 2nd number :" +b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping numbers: a :" +a);
        System.out.println("After swapping number b: " +b);

    }

}
