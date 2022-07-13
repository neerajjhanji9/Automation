package com.matrix.jayesh.constructor;

public class Constructorcopy {
    int a;
    Constructorcopy(int a){
        this.a=a;
    }

    Constructorcopy(Constructorcopy copyVal){
        a = copyVal.a;
    }

    void display(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Constructorcopy obj1 = new Constructorcopy(10);
        obj1.display();

        Constructorcopy obj2 = new Constructorcopy(obj1); // copy of object
        obj2.display();
    }

}
