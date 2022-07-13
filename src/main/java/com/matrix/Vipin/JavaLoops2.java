package com.matrix.Vipin;

import java.util.*;

public class JavaLoops2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 1;
        for (int i = 2; i<35; i++){
            mul = i*n;
            System.out.println(mul);
        }
    }
}
