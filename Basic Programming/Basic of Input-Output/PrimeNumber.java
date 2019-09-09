package com.vuscreen;

/*
You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000
/

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class PrimeNumber {
    public static void primeNumbers(int L){
        int flag = 0;
        for(int i = 2;i<=L;i++){
            for(int j = 2;j <= i/2;j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.print(i+" ");
            else{
                flag = 0;
            }
        }
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int L = Integer.parseInt(line);
        primeNumbers(L);
    }
}

