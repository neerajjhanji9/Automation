package com.matrix.amita.corejava.constructor;

public class Constructor3 {

    String name;
    int EmpID;


    Constructor3(String nm, int ID){
        name = nm;
        EmpID = ID;
        System.out.println(name);
        System.out.println(EmpID);
    }


    public static void main(String[] args) {
        Constructor3 obj=new Constructor3("Amita", 100);
        Constructor3 obj1=new Constructor3("Rajendra", 200);
        Constructor3 obj2=new Constructor3("Lavanya", 300);
    }

}
