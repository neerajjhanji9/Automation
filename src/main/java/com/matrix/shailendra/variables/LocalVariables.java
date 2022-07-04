package com.matrix.shailendra.variables;

import java.util.List;

public class LocalVariables {
    // method
    public void getSum(){
        int a=24;
        int b=76;
        int c=a+b;
        int arr [] = {34,87};
        System.out.println(arr);
        System.out.println(c);
    }
    public void getDetails(int wieght){
        wieght = 67; // Local Variables
        System.out.println(wieght);
    }
    // constructor
    LocalVariables(){
        String str="Shailendra";
        System.out.println(str);
    }

    // block
       {
        int c= 15;
        double d=11.5;
        double g=c*d;
        System.out.println(g);
        }

    public static void main(String[] args) {
        // Local variables
        int r= 89;
        System.out.println(r);

    }
}
