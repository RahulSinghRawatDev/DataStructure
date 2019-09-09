package com.vuscreen;

/*You have been given a positive integer N. You need to find and print the Factorial of this number. The Factorial of a positive integer N refers to the product of all number in the range from 1 to N. You can read more about the factorial of a number here.

        Input Format:
        The first and only line of the input contains a single integer N denoting the number whose factorial you need to find.

        Output Format
        Output a single line denoting the factorial of the number N.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

class Factorial {

    public static void findFactorial(int input){
        int result = 1;
        for(int i = 1;i<=input;i++){
            result = result * i;
        }
        System.out.println(result);

    }

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        findFactorial(input);
    }
}

