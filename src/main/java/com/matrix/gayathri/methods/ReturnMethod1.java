package com.matrix.gayathri.methods;

public class ReturnMethod1 {
    int x =10;
    int y =20;
    int a = 100;
    int b = 200;

    public int addition(){
        int x =1000;
        int y =2000;
        System.out.println(this.x + x);
        System.out.println(y +this.y);
        return this.x+y;
    }
    public int add(){
         int a = 300;
         int b =  400;
        System.out.println(this.a + b);
        System.out.println(this.x +this.b);
         return a+this.b;
    }

    public static void main(String[] args) {
        ReturnMethod1 obj= new ReturnMethod1();
       int i = obj.addition();
        System.out.println(i);
       int i1= obj.add();
        System.out.println(i1);


    }


}
