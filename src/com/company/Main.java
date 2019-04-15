package com.company;
import javax.imageio.IIOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("Enter an integer: ");
            Scanner scnr = new Scanner(System.in);
            IntTest.numberCheck(scnr.next());
            if (scnr.hasNextInt()) {
                System.out.println("Input is " + scnr.next());
                x = 2;
            }

            System.out.println("Enter a float: ");
            floatNum.numTest(scnr.next());
            if (scnr.hasNextFloat()) {
                System.out.println("Input is " + scnr.next());
                x = 2;

            }

            System.out.println("Enter a string: ");
            formatString.testString(scnr.next());
            if (scnr.hasNextLine()) {
                System.out.println("String is " + scnr.next());
                x = 2;
            }

            System.out.println("Enter 3 integers: ");
            numberFormat.numberTester(scnr.next());
            if (scnr.hasNextInt()) {
                System.out.println("Correct. 3 integers.");
                x = 2;
            }


        }while (x == 1) ;

    }

}

