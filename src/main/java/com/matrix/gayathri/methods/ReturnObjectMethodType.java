package com.matrix.gayathri.methods;

public class ReturnObjectMethodType {
    public Neighbour1 getDetails(){
        Neighbour1 ne = new Neighbour1();
        return ne;
    }


    public static void main(String[] args) {
        ReturnObjectMethodType obj = new ReturnObjectMethodType();
        Neighbour1 ne = obj.getDetails();
        System.out.println(ne.name +" of age "+ ne.age+ " is an "+ ne.occupation);


    }


}