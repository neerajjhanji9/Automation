package com.matrix.jayesh.finalKeywords;

public class FinalMethod extends FinalMethodA{
    /* public void setValue(){
        // 'setValue()' cannot override 'setValue()' in 'com.matrix.jayesh.finalKeywords.FinalMethodA'; overridden method is final
    } */
    public static void main(String[] args) {
        FinalMethod obj = new FinalMethod();
        obj.setValue();
    }
}
