package com.company;

public class formatString {
    public static void testString (String word){
        try{
            new Integer(word);
            System.out.println(word + "is a number. Enter a string");
            return;
        }catch(Exception notString){
            System.out.println(word +"is no a string. Enter a string");
        }
    }
}
