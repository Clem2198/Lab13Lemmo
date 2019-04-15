package com.company;

public class floatNum {
    public static void numTest(String num){
        try{
            new Integer(num);
            System.out.println(num + " is an integer. Enter a float.");
            return;
        } catch (Exception notFlat){
            System.out.println(num + "is not a number Please enter a float.");
        }
    }
}
