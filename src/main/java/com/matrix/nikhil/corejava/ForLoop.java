package com.matrix.nikhil.corejava;

public class ForLoop {
    {
        for (int i=1;i<=5;i++) {
            for (int j = 1; j <=i; j++) {

                System.out.println(i);
            }
        }
    }
    {
        System.out.println("----------------");
        for (int i=1;i<=5;i++) {
            for (int j = 1; j <=i; j++) {

                System.out.println("*");

            } System.out.println("----Loop------------");
        }

    }

    public static void main(String[] args) {
new ForLoop();
    }
}
