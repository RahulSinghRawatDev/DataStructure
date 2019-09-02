package com.vuscreen;
/*
You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.

Constraints

Note
String S consists of lowercase English Alphabets only.
*/


/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class PalindromString {
    public static void main(String args[] ) throws Exception {
        String reverse = "";
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        checkPalindrome(name,reverse);
    }

    public static void checkPalindrome(String name,String reverse){
        String finalData = reverse;
        for(int i = name.length()-1;i >= 0;i--){
            finalData =  finalData + name.charAt(i);
        }

        if(name.equals(finalData))
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}

