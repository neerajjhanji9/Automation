package com.matrix.rahuly.constructor;

public class Constructor {


    int a;
    char ch;
    //Method
    public void getData() {
        System.out.println(a);
        System.out.println(ch);
    }

    //Constructor
    public Constructor(int no, char IT) {
        a = no;
        ch = IT;

    }

    public static void main(String[] args) {

        Constructor L1 = new Constructor(115 , 'R');
        L1.getData();
        Constructor L2 = new Constructor(107, 'N');
        L2.getData();

    }


}



