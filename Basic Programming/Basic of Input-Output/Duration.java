package com.vuscreen;

/*Rahul is a very busy persion he dont wan't to waste his time . He keeps account of duration of each and every work. Now he don't even get time to calculate duration of works, So your job is to count the durations for each work and give it to rahul.



        Input:

        First line will be given by N number of works
        Next N line will be given SH,SM,EH and EM  each separated by space(SH=starting hr, SM=starting min, EH=ending hr, EM=ending min)
        Output:

        N lines with duration HH MM(hours and minutes separated by space)*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Duration {
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

        // Write your code here
        Scanner s = new Scanner(System.in);
        String dataSize = s.nextLine();                 // Read number of inputs
        loopFunc(s,Integer.parseInt(dataSize));
    }

    public static void loopFunc(Scanner s,int size){
        for (int i = 0;i < size ; i++){
            String dataValues = s.nextLine();
            splitFunc(dataValues);
        }
    }

    public static void splitFunc(String dataValues){
        String val[] = dataValues.split(" ");
        int startHours = Integer.parseInt(val[0]);
        int startMinutes = Integer.parseInt(val[1]);
        int endHours = Integer.parseInt(val[2]);
        int endMinutes = Integer.parseInt(val[3]);
        printOutput(startHours,startMinutes,endHours,endMinutes);

    }

    public static void printOutput(int startHours,int startMinutes,int endHours,int endMinutes){
        int outputMinutes;
        int outputHours;

        if(((60 - startMinutes) + endMinutes) > 60){

            outputMinutes = ((60 - startMinutes) + endMinutes)-60;
            outputHours = (endHours - startHours);
        }else if(((60 - startMinutes) + endMinutes) == 60){

            outputMinutes = 0;
            outputHours = (endHours - startHours + 1 - 1);

        }else{
            outputMinutes =((60 - startMinutes) + endMinutes);
            outputHours = (endHours - startHours - 1);
        }

        System.out.println(outputHours + " "+ outputMinutes);
    }

}
