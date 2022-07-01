package com.matrix.amita.corejava.constructor;

public class Constructor1 {

    String name;
    int EmpID;


    Constructor1(String nm, int ID){
        name = nm;
        EmpID = ID;

    }
    public void getData(){
        System.out.println(name);
        System.out.println(EmpID);
    }

    public static void main(String[] args) {
        Constructor1 obj=new Constructor1("Amita", 100);
        obj.getData();

        Constructor1 obj1=new Constructor1("Rajendra", 200);
        obj1.getData();

        Constructor1 obj2=new Constructor1("Lavanya", 300);
        obj2.getData();
    }
}
