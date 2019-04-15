package com.company;

import java.util.ArrayList;

public class numberFormat {
    public static void numberTester(String numbers){
        try{
            new Double (numbers);
            System.out.println();
            return;
        } catch (Exception notFloat){
            System.out.println(numbers+ " is not a number. Enter 3 integers.");
        }
        try{
            new ArrayList<>(3);
            System.out.println("Retry. The numbers you typed are" + numbers + ". They are not integers, try again");
            return;
        }catch (Exception e){
            System.out.println( "3 integers have not been typed. Try again" + numbers);
        }
    }
}
