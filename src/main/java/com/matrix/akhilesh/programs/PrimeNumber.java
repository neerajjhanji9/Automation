package com.matrix.akhilesh.programs;

public class PrimeNumber {

    public static void main(String[] args) {
        int m,n = 11,flag = 0;
        m = n/2;

        for(int i=2; i<=m; i++){
            if(n%i == 0){
                System.out.println("not prime number");
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("prime number");
        }
    }
}
