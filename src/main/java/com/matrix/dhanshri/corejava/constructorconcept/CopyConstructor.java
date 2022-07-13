package com.matrix.dhanshri.corejava.constructorconcept;

public class CopyConstructor {
    int age;
    String name;

    public CopyConstructor(int age, String name){
        this.age= age;
        this.name= name;
    }

    CopyConstructor(CopyConstructor o){

    }

    public void getDetails(){
        System.out.println(" Age value is:  "    +age);
        System.out.println(" Name is :  "    +name);
    }

    public static void main(String[] args) {
        CopyConstructor ob1= new CopyConstructor(15, "Minakshi");
        CopyConstructor ob2= new CopyConstructor(ob1);
        ob1.getDetails();

    }
}
