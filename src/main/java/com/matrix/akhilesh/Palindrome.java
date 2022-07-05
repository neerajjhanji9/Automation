package com.matrix.akhilesh;

public class Palindrome {

    int i;

    int n = 454;
    int sum = 0;

    public static void main(String[] args) {
        Palindrome pt = new Palindrome();
        pt.getPalinDrome();
    }

    public void getPalinDrome(){
        int temp = n;

        while (n > 0){
            int r = n % 10;

            sum = (sum * 10) + r;

            n = n / 10;
        }



        if(temp == sum){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }

    }
}
