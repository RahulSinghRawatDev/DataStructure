package com.vuscreen;

/*
Given two strings of equal length, you have to tell whether they both strings are identical.

        Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.

        Input :

        First line, contains an intger 'T' denoting no. of test cases.
        Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
        Output:

        For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.
        Constraints:

        1<= T <=100
        1<= |S1| = |S2| <= 10^5
        String is made up of lower case letters only.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TwoString {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int count = Integer.parseInt(name);
        looperFunction(br,count);
    }

    public static void looperFunction(BufferedReader br,int count) throws Exception{
        for(int i = 0;i<count;i++){
            String data = br.readLine();
            splitString(data);
        }
    }

    public static void splitString(String data){
        String [] splitString = data.split(" ");
        amalgamFunction(splitString[0],splitString[1]);
    }

    public static void amalgamFunction(String s1,String s2){
        if(s1.length() == s2.length()){
            char[] mainString = s1.toCharArray();
            char[] SampleString = s2.toCharArray();
            Arrays.sort(mainString);
            Arrays.sort(SampleString);
            if(Arrays.equals(mainString,SampleString))
                System.out.println("YES");
            else
                System.out.println("NO");
        }else{
            System.out.println("NO");

        }
    }
}

