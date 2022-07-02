package com.matrix.nikhil.corejava.Constructer;

public class Constructer2 {
    int iD;
    int a;
    String name;
    String companyName;
    public Constructer2(int iD,String name,String companyName){
        this.iD=iD;
        this.name=name;
        this.companyName=companyName;
        System.out.println("I'd No:"+iD);
        System.out.println("Name :"+name);
        System.out.println("Company Name :"+companyName);

    }
    public Constructer2(int a){
        this.a=a;

        System.out.println("Value :"+a);
    }

    public static void main(String[] args) {
        new Constructer2(101,"Shri","TCS");
        new Constructer2(102,"Nikhil","Novarites");
        new Constructer2(103,"Pratham","Appollo");
        new Constructer2(301);
    }
}
