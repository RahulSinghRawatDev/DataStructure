package com.vuscreen;


/*Consider All lowercase Alphabets of the English language. Here we consider each alphabet from a to z to have a certain weight. The weight of the alphabet a is considered to be 1, b to be 2, c to be 3 and so on until z has a weight of 26. In short, the weight of the alphabet a is 1, and the weight of all other alphabets is the weight of its previous alphabet + 1.

        Now, you have been given a String S consisting of lowercase English characters. You need to find the summation of weight of each character in this String.

        For example, Consider the String aba

        Here, the first character a has a weight of 1, the second character b has 2 and the third character a again has a weight of 1. So the summation here is equal to : 1+2+1=4

        Input Format:

        The first and only line of input contains the String S.

        Output Format:

        Print the required answer on a single line

        Constraints:

        1≤|S|≤100*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
class CharSum {
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
        String name = s.nextLine();

        sumFunc(name);

    }

    public static void sumFunc(String data){
        int sum = 0;
        for(int pos = 0;pos<data.length();pos++){

            char sumData = data.toCharArray()[pos];
            int charAscii = (int) sumData;
            sum = sum + (charAscii - 96);

        }

        System.out.println(sum);

    }
}

