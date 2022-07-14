package com.matrix.motilal.constructors;

public class CopyConstructor {
    int a;
    int b;
    CopyConstructor(){  //default Constructor

    }
    CopyConstructor(CopyConstructor c){ //Constructor with class obj as para
    a=c.a;
    b=c.b;
    }
    CopyConstructor(int a,int b){ //Constructor with para
        this.a=a;
        this.b=b;
       // System.out.println("values = "+ this.a +" and "+ this.b);
    }
    public void display(){
        System.out.println("values = "+ this.a +" and "+ this.b);
    }
    public static void main(String[] args) {
        //copying values with constructor
        CopyConstructor c1=new CopyConstructor(1,2);
        CopyConstructor c2=new CopyConstructor(c1);
        c2.display();

        System.out.println("--------------");
        //copying values without constructor
        CopyConstructor c3 = new CopyConstructor();
        c3.a=c2.a;
        c3.b=c2.b;
        c3.display();

    }
}
