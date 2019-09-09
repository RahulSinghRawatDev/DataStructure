package com.vuscreen;

/*
Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

        We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

        Input Format

        The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

        Output Format

        Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)

*/

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

class AliandHelpinginnocentPeople {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String inputData = s.nextLine();                 // Reading input from STDIN
        splitFun(inputData);
    }

    public static void splitFun(String data){
        char[] charArray = data.toCharArray();
        if(charArray[2] =='A' || charArray[2] =='E' || charArray[2] =='I' || charArray[2] =='O'
                || charArray[2] =='U'|| charArray[2] =='Y'){
            System.out.println("invalid");
            return;
        }

        checkConsecutiveFun(charArray);
    }
    public static void checkConsecutiveFun(char[] data){
        int sum = 0;
        boolean isValid = false;
        int count = 0;

        for(int pos = 0;pos<data.length;pos++){
            if(pos == 2 || pos == 6){
                sum = 0;
                count = 0;
            }else{

                count ++;

                sum = sum + data[pos];

                if(count == 2)
                {
                    count = 1;


                    if(sum %2 == 0)
                    {

                        isValid = true;

                    }else{

                        isValid = false;
                        System.out.println("invalid");
                        return;
                    }

                    sum = data[pos];

                }

            }

        }

        if(isValid)
            System.out.println("valid");


    }
}


