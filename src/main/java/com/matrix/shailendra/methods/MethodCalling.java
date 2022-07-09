package com.matrix.shailendra.methods;

public class MethodCalling {
    public void getSum() {   // method declaration
        int a = 23;          // method implementation
        int b = 67;
        int c = a + b;
        System.out.println("Sum value is=" + c);
    }

    public static void getInfo(String str) {// static method declaration
        System.out.println(str);
        //static method implementation
    }

    public static void main(String[] args) {
        MethodCalling obj = new MethodCalling();
        obj.getSum();          //  method calling
        getInfo("Shailendra");  // static method Direct calling
        MethodCalling.getInfo("Soundhiya");   // static method using class calling
        obj.getInfo("Jabalpur");          // static method by object ref calling
    }
}
