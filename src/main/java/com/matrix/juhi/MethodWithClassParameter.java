package com.matrix.juhi;

public class MethodWithClassParameter {


    public void enterInfo (){
        Member a = new Member();
        System.out.println(a.name);
        System.out.println(a.state);
    }

    public static void main(String [] args){
        MethodWithClassParameter b = new MethodWithClassParameter();
        b.enterInfo();
    }
}
