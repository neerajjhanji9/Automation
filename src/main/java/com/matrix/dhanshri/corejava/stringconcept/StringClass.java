package com.matrix.dhanshri.corejava.stringconcept;

public class StringClass {
    public static void main(String[] args) {
        String str1 = "Dhanashri";
        System.out.println("startswith() ::   "      +str1.startsWith("Dhanu") );
        System.out.println("endswith() ::     "       +str1.endsWith("shri"));

        System.out.println("contains()::      "        +str1.contains("dh"));
        System.out.println("contains():       "         +str1.contains("na"));

        System.out.println("replace() ::     "          +str1.replace("D", "d"));
        System.out.println("replace()::      "           +str1.replace("Dhana", "Dhan"));

        System.out.println("indexof(char)::     "            +str1.indexOf('r'));
        System.out.println("indexof(string)::    "           +str1.indexOf("hri"));
        System.out.println("lastindexof(char)::    "          +str1.lastIndexOf('a')  );

        System.out.println("isEmpty() ::       "          +str1.isEmpty());

        //Substring concept ::
        System.out.println("substring(int)::       "        +str1.substring(0));
        System.out.println("substring(int, int)::       "        +str1.substring(0, 7));
        System.out.println("substring(int, int)::       "        +str1.substring(0, 9));

        char[] chArr= str1.toCharArray();// string char[]
        String[] stArr= { "Dha", "Dhana", "shri", "Dhanaa", "Shravni"};

        //System.out.println();
        for(char ch: chArr){
            System.out.print(ch  +  " ");
        }
        System.out.println();

        //For each loop
        System.out.println("-----------------for each loop---------------");
        for(String st : stArr){
            System.out.println(st +  " " );
        }
        for (int i=0; i<=8; i++){
            System.out.print(chArr[i]);
        }
        //System.out.println();
        String str2= "Dhan  shri Dhana   Bhosale";

        String[] strArr= str2.split(" ");
        for(String st: strArr) {
        }
        //System.out.println();
        System.out.println("-------------------for loop------------------");
        //System.out.println();
        for(int i=1; i<=3; i++){
            System.out.println(strArr[i]);
        }
        String str3= "Dhanashri   Bhosale";
        System.out.println(str3.replaceAll("  ", "Shri"));

    }
}
