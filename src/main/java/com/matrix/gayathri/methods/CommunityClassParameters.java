package com.matrix.gayathri.methods;

public class CommunityClassParameters {
    public void getData(Neighbour1 N){
        System.out.println(N.name);
        System.out.println("Age : "+ N.age);
        System.out.println("D.no : "+ N.d_no);

    }
    public void getInfo(Neighbour2 Ne){
        System.out.println(Ne.name);
        System.out.println("Age : "+Ne.age);
        System.out.println("D.no: " +Ne.d_no);
    }
    public void compare(char c, String s){
        System.out.println("wing "+ c + " have " + s);

    }
    public static void main(String[] args) {
        Neighbour1 obj1 = new Neighbour1();
        Neighbour2 obj2 = new Neighbour2();
        CommunityClassParameters ob =new CommunityClassParameters();
        ob.getData(obj1);
        System.out.println("----------");
        ob.getInfo(obj2);
        System.out.println("----------");
        ob.compare(obj1.wing, obj1.occupation);
        ob.compare(obj2.wing, obj2.occupation);




    }
}
