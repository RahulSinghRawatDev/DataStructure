package com.vuscreen;


/*Aditya is fond of ladders. Everyday he goes through pictures of ladders online but unfortunately today he ran out of ladder pictures online. Write a program to print “ladder with N steps”, which he can use to get his daily dose of ladder love.

INPUT:
Input contains integer N, the number of steps in the ladder

OUTPUT:

Print the ladder with the gap between two side rails being 3 spaces(“   “).

Check the sample output for format of printing the ladder.

CONSTRAINTS:

1<=N<=40
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Ladderophilia {
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
        String ladderCount = s.nextLine();                 // Reading input from STDIN
        generateLadderFunc(Integer.parseInt(ladderCount));
    }


    public static void generateLadderFunc(int ladderCount){
        for(int pos = 0;pos < ladderCount;pos++){
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            if(pos==ladderCount-1)
            {
                System.out.println("*   *");
                System.out.println("*   *");
            }

        }

    }

}

