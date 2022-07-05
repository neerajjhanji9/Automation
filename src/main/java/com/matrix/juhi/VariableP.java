package com.matrix.juhi;

public class VariableP {

    int a=10;
    int b=20;
    public void multiply(int a, int b){

        System.out.println(a*b);//125
        System.out.println(this.a * this.b);//200
    }

    public static void main(String [] args){
        VariableP s = new VariableP();
        s.multiply(25,5);
    }
}
