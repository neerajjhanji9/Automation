package com.matrix.shailendra.variables;

public class LocalVariablesObj {
        // method
        public void getSum(){
            int a=24;
            int b=76;
            int c=a+b;
            System.out.println(c);
        }
        // constructor
        LocalVariablesObj(){
            String str="Shailendra";
            System.out.println(str);
        }

        // block
        {
            int c= 15;
            double d=11.5;
            double g=c*d;
            System.out.println(g);
        }

        public static void main(String[] args) {
            // Local variables
            int r= 89;
            System.out.println(r);
           // By using Object reference
            LocalVariablesObj obj = new LocalVariablesObj();
            obj.getSum();
        }

}
