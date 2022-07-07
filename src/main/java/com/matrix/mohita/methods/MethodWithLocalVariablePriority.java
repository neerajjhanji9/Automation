package com.matrix.mohita.methods;

public class MethodWithLocalVariablePriority {
    int x = 20;
    int y = 40;
    float a = 3.3f;
    float b = 4.4f;

    public void addition(int x, int y){
        System.out.println("case 1 : "+ (x+y));
        System.out.println("case 2 : "+ (this.x + y));
        System.out.println("case 3 : "+ ( x+this.y));
        System.out.println("case 4 : "+ ( this.x + this.y));
    }
    public void multiplication(float a, float b){
        System.out.println("case 1 :" + (a*b));
        System.out.println("case 2 :" + (this. a*b));
        System.out.println("case 3 :" + ( a* this.b));
        System.out.println("case 4 :" + ( this.a* this.b));
    }

    public static void main(String[] args) {
        MethodWithLocalVariablePriority obj = new MethodWithLocalVariablePriority();
        System.out.println("Number of Additions can be:");
        obj.addition (200,400);
        System.out.println("Number of Multiplications can be:");
        obj. multiplication(5.5f,6.6f);
    }
}

