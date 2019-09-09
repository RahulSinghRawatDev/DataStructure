package com.vuscreen;

/*
Little Jhool always wanted to have some psychic powers so that he could showoff his skills, and magic to people and impress them. (Specially, his girlfriend Big Jhool!) But, in spite all his efforts, hardwork, dedication, Googling, watching youtube videos he couldn't garner any psychic abilities!

He knew everyone was making fun of him, so to stop all of that - he came up with a smart plan. Anyone who came to him to know about their future, he asked them to write a binary number for him - and then, he smartly told them if the future for that person had good in store, or bad.

The algorithm which Little Jhool follows is, as following:

If the binary number written by the person has six consecutive , or , his future is bad.
Otherwise, he says that their future is good.
Input format:

Single line contains a binary number.

Output format:

You need to print "Good luck!" (Without quotes, and WITH exclamation mark!) if the Jhool is going to tell them that they're going to have a good time. Else, print "Sorry, sorry!" if the person is going to be told that he'll have a hard time!

Constraints:

The binary number will be in string format, with the maximum length being  characters.*/

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

class  LittleJhoolandpsychicpowers {
     public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        char[] data = name.toCharArray();
        int count = 0;
        char prev = 'a';
        
        for(int i = 0;i< data.length;i++){
            if(prev == 'a')
            prev = data[i];
            if(data[i] == prev){
                count ++;
            }else{
                count = 1;
                prev = data[i];
            }
            
            
            if(count == 6){
                break;
            }
        }
        
        if(count == 6){
            System.out.println("Sorry, sorry!");
        }else{
            System.out.println("Good luck!");            
        }
       
    }
}


