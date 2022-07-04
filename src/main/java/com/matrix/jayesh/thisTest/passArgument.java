package com.matrix.jayesh.thisTest;

public class passArgument {
    int test = 50;

    passArgument(){
        passArgument1 obj2 = new passArgument1(this);
        obj2.display();

    }

    public static void main(String[] args) {
        passArgument obj = new passArgument();
    }
}
