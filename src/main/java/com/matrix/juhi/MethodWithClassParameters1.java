package com.matrix.juhi;

public class MethodWithClassParameters1 {

    public void enterInfo(Member a){
        System.out.println(a.name);
        System.out.println((a.state));

    }
    public static void main(String [] args){
        Member d = new Member();

        MethodWithClassParameters1 b = new MethodWithClassParameters1();

        b.enterInfo(d);
    }
}
