package com.vuscreen;
/*
There are 7 floors in BH3 and only 2 lifts. Initially Lift A is at the ground floor and Lift B at the top floor. Whenever someone calls the lift from N th floor, the lift closest to that floor comes to pick him up. If both the lifts are at equidistant from the N th floor, them the lift from the lower floor comes up.

*/


/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Liftqueries {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        Scanner s = new Scanner(System.in);
        String testCaseCount = s.nextLine();                 // Reading input from STDIN

        // Write your code here
        testCaseFun(Integer.parseInt(testCaseCount),s);
    }

    public static void testCaseFun(int count, Scanner sc){
        int liftAPos = 0;
        int liftBPos = 7;

        for(int pos = 0; pos <count ; pos ++){
            int data = Integer.parseInt(sc.nextLine());

            int aDiff = data - liftAPos;
            int bDiff = liftBPos - data;

            if((aDiff - bDiff) == 0 ){
                System.out.println("A");
                liftAPos = data;
            }else if(aDiff<bDiff){
                System.out.println("A");
                liftAPos = data;
            }else{
                System.out.println("B");
                liftBPos = data;
            }

        }
    }



}

