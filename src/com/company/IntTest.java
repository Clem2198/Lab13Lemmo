package com.company;

public class IntTest {
    public static void numberCheck(String number){
        try{
            new Double(number);
            System.out.println(number+"is a floating-point number, please enter an integer.");
            return;
        }catch(NumberFormatException notFloaat){
            System.out.println(number + "is not a number, pleasse enter an integer.");
        }
    }
}
