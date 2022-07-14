package com.matrix.motilal.methods;

public class TypesOfInstanceMethod {
    private int roll;
    private String name;
    public int getRoll()    //accessor method or getters
    {
        return roll;
    }
    public void setRoll(int roll) //mutator method or setters
    {
        this.roll = roll;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Roll no.: "+roll);
        System.out.println("Student name: "+name);
    }

    public static void main(String[] args) {
        TypesOfInstanceMethod t=new TypesOfInstanceMethod();
        t.setRoll(1);
        t.setName("dinesh");
//        System.out.println(t.getRoll());
//        System.out.println(t.getName());
        t.display();

    }
}
