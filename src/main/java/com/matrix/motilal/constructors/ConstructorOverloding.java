package com.matrix.motilal.constructors;

public class ConstructorOverloding {
    int a;
    String b;
    ConstructorOverloding(){ //no para Constructor
        System.out.println("I am in default Constructor");
    }
    ConstructorOverloding(int a){  //single para Constructor
        this.a=a;
        System.out.println("Value A= "+ this.a);
    }
    ConstructorOverloding(int a,String b){  //multiple para Constructor
        this.a=a;
        this.b=b;
        System.out.println("Value A= "+ this.a);
        System.out.println("Value B= "+ this.b);
    }
    public void display(){
        System.out.println("I am in Method");
    }
    public static void main(String[] args) {
        //1st way of obj creation i.e names
        ConstructorOverloding c1;
        c1=new ConstructorOverloding(2);

        System.out.println("-----------------");
        //2nd way of obj creation i.e names
        ConstructorOverloding c2=new ConstructorOverloding(2,"Deepali");

        System.out.println("-----------------");
        //3rd way of obj creation i.e names less
        new ConstructorOverloding(1);
        new ConstructorOverloding(1,"Dinesh");

        System.out.println("-----------------");
        new ConstructorOverloding().display();
    }
}
