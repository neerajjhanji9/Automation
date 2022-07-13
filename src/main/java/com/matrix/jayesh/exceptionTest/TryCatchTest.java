package com.matrix.jayesh.exceptionTest;

public class TryCatchTest {
    public static void main(String[] args) {

        try{
            int i = 100/0;
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("*********************************");

        try{
            int i = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("*********************************");

        // custom
        try{
            int i = 100/0;
        }catch (ArithmeticException e){
            System.out.println("Error message");
        }

        System.out.println("***********************************");

        try{

        }catch (ArithmeticException e){
            int i = 100/0;
            System.out.println(e);
        }

        // multiple try catch
        try{
            int i = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e); // Run // java.lang.ArithmeticException: / by zero
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e);
        }

        try{
            int[] ik = new int[5];
            System.out.println(ik[6]);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e); // Run //java.lang.ArrayIndexOutOfBoundsException: 6
        } catch (Exception e){
            System.out.println(e);
        }

        try{
            String strk= null;
            System.out.println(strk);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } catch (Exception e){
            System.out.println(e); // Run //null
        }

    }

}
