package com.vuscreen;

/*
Dhananjay has recently learned about ASCII values.He is very fond of experimenting. With his knowledge of ASCII values and character he has developed a special word and named it Dhananjay's Magical word.

        A word which consist of alphabets whose ASCII values is a prime number is an Dhananjay's Magical word. An alphabet is Dhananjay's Magical alphabet if its ASCII value is prime.

        Dhananjay's nature is to boast about the things he know or have learnt about. So just to defame his friends he gives few string to his friends and ask them to convert it to Dhananjay's Magical word. None of his friends would like to get insulted. Help them to convert the given strings to Dhananjay's Magical Word.

        Rules for converting:

        1.Each character should be replaced by the nearest Dhananjay's Magical alphabet.

        2.If the character is equidistant with 2 Magical alphabets. The one with lower ASCII value will be considered as its replacement.

        Input format:

        First line of input contains an integer T number of test cases. Each test case contains an integer N (denoting the length of the string) and a string S.

        Output Format:

        For each test case, print Dhananjay's Magical Word in a new line.

        Constraints:

        1 <= T <= 100

        1 <= |S| <= 500*/


/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MagicWord {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        caseCounter(count,br);
    }

    public static void caseCounter(int count,BufferedReader br) throws Exception{
        for(int i = 1;i<=count;i++){
            int countWord = Integer.parseInt(br.readLine());
            String data = br.readLine();
            funMagicalWord(countWord,data);
        }
    }

    public static void funMagicalWord(int counterWord,String data){
        char[] dataArray = data.toCharArray();
        StringBuilder resultData = new StringBuilder();
        for(int i = 0;i<counterWord;i++){
            char datas = dataArray[i];
            int result = checkPrime((int)datas);
            resultData.append((char)result);
        }
        System.out.println(resultData.toString());
    }


    public static int checkPrime(int number){
        int incrementedNumber = number,decrementedNumber = number;
        Boolean checkIncrement = true;
        int dummyNumber = number;
        while(true)
        {
            if(funPrime(dummyNumber)){
                return dummyNumber;
            }else{
                if(checkIncrement){
                    checkIncrement = false ;
                    decrementedNumber  = decrementedNumber - 1;
                    dummyNumber = decrementedNumber;
                }else{
                    checkIncrement = true ;
                    incrementedNumber  = incrementedNumber + 1;
                    dummyNumber = incrementedNumber;
                }

            }
        }
    }


    public static Boolean funPrime(int number){
        int i,m=0,flag=0;
        m=number/2;
        for(i=2;i<=m;i++){
            if(number%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0)  {
            if(number>64 && number<91 || number > 96 && number<123)
                return true;
            else
                return false;
        }else{
            return false;
        }
    }

}

