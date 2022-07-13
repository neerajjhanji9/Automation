package com.matrix.jayesh.thisTest;

public class PassArgument {
    int test = 50;

    PassArgument(){
        PassArgument1 obj2 = new PassArgument1(this);
        obj2.display();

    }

    public static void main(String[] args) {
        PassArgument obj = new PassArgument();
    }
}
