package com.matrix.jayesh.operator;

public class OperatorTest {
    public static void main(String[] args) {
        //Unary
        //postfix
        int x=10;
        int y=10;
        System.out.println(x++);
        System.out.println(y--);

        //prefix
        int z = 10;
        System.out.println(++z);
        int q=10;
        System.out.println(--q);
        int w =10;
        System.out.println(-w);
        int r =10;
        System.out.println(+r);
        System.out.println("_________________________________");
        //arithmetric();
        //shift();
        ternary();
        //real();
    }

    /**
     * Arithmetic
     *multiplicative 	* / %
     * additive + -
     *
     * */
    static  void arithmetric(){
        int i = 10;
        int p = 10;
        System.out.println("_________________________________");
        System.out.println(i+p);
        System.out.println(i/p);
        System.out.println(i*p);
        System.out.println(i-p);
        System.out.println(i%p);
    }
    /*
    * Shift << >> >>>
    * negative nummber equal to 0
    * */
    static void shift(){
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10>>2);//10/2^2=10*4=2
        System.out.println(-10>>2);//10/2^2=10/4=-3
        System.out.println(10>>>2);//10*2^2=10*4=2
    }

    /**
     * Relational
     * 	comparison < > <= >= instanceof
     * 	equality == !=
     *
     * */

    /**
     * Bitwise
     * bitwise AND &
     * bitwise exclusive OR ^
     *itwise inclusive OR |
     ***/

    /**
    * Logical
     *  logical AND &&
    * logical OR ||
    *
    * */
    static void real(){

        if(true || true){
            System.out.println("true");
        }else {
            System.out.println("flase");
        }

        if(true && true){
            System.out.println("true");
        }else {
            System.out.println("flase");
        }
    }
    /**
     * Ternary ? :
     * like as if else loop
     *
     * */


    static void ternary(){
        int g = 10;
        int l = 8;
        String result = g<l ?"wow":"MOM";
        System.out.println(result);
    }
}
