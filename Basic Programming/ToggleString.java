package com.vuscreen;
/*You have been given a String S consisting of uppercase and lowercase English alphabets. You need to change the case of each alphabet in this String. That is, all the uppercase letters should be converted to lowercase and all the lowercase letters should be converted to uppercase. You need to then print the resultant String to output.

        Input Format
        The first and only line of input contains the String S

        Output Format
        Print the resultant String on a single line.

        Constraints
        where S denotes the length of string S.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ToggleString {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        lowerCase(name);
    }

    public static void lowerCase(String name){
        char[] input = name.toCharArray();
        for(int i = 0;i<name.length();i++){
            if((int) input[i]>=65 && (int) input[i] <=90){
                int d = (int) input[i]+ 32;
                System.out.print((char)d);
            }
            else{
                int data = (int) input[i]- 32;
                System.out.print((char)data);
            }
        }
    }
}

