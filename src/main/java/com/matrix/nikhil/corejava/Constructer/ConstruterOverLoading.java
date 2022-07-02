package com.matrix.nikhil.corejava.Constructer;

public class ConstruterOverLoading {
    String name;
    String place;
    int date;
    ConstruterOverLoading(String name,String place,int date)
    {
        this.name=name;
        this.place=place;
        this.date=date;
        System.out.println("Name :"+name);
        System.out.println("City :"+place);
        System.out.println("Date Of Birth :"+date);
    }
    ConstruterOverLoading(String name,String place){
        this.name=name;
        this.place=place;
        System.out.println("Name :"+name);
        System.out.println("District :"+place);

    }
    ConstruterOverLoading(int date){
        this.date=date;
       // this.place=place;
        System.out.println("Date :"+date);
       // System.out.println("District :"+place);

    }
    ConstruterOverLoading(String name,int date)
    {
        this.name=name;
        this.date=date;
        System.out.println("Name :"+name);
        System.out.println("Date Of Birth :"+date);
    }

    public static void main(String[] args) {
        new ConstruterOverLoading("Shri","Pune",29);
        new ConstruterOverLoading("Nikhil","Solapur",18);
        new ConstruterOverLoading("Pratham","Solapur",18);
        new ConstruterOverLoading("Anil","Solapur");
        new ConstruterOverLoading("Nagesh","Solapur");
        new ConstruterOverLoading("solapur",23);
        new ConstruterOverLoading(11);
    }
}
