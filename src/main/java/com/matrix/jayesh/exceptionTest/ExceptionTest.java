package com.matrix.jayesh.exceptionTest;

public class ExceptionTest {
    /**
     * Exception is an abnormal condition.
     * thrown at runtime.
     * ClassNotFoundException, IOException, SQLException, RemoteException,
     * Ad - to maintain the normal flow of the application
     * two types of exceptions
     *  - Checked Exception - inherit the Throwable class except RuntimeException, IOException, SQLException
     *  - Unchecked Exception - inherit the RuntimeException, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException
     *  *-Error - OutOfMemoryError, VirtualMachineError, AssertionError
     * */
    public static void main(String[] args) {
        //int i = 100/0;
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        // rest of the code is not executed -> we need to add try catch statement
        //System.out.println(i);

        try {
            int j = 100/0;
        }catch (ArithmeticException e){
            System.out.println(e); // java.lang.ArithmeticException: / by zero
            // Unchecked Exception
        }

        //int[] k = new int[5];
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(k[6]);

        String str = null;
        //Exception in thread "main" java.lang.NullPointerException
        System.out.println(str.length());
    }
}
