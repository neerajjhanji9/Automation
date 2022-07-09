package com.matrix.shailendra.methods;

public class MethodChaining2 {
    public void empName(String str) {
        System.out.println("Name is:" + str);
    }

    public void idNum(int a) {
        empName("Shailendra");
        System.out.println("Room Num is:" + a);
    }

    public static void main(String[] args) {
        MethodChaining2 obj = new MethodChaining2();
        obj.idNum(200);
    }
}
