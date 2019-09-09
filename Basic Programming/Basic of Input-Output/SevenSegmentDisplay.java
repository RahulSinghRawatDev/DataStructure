package com.poc.vistaraweb.adapter;


/*
You all must have seen a seven segment display.If not here it is:



Alice got a number written in seven segment format where each segment was creatted used a matchstick.

Example: If Alice gets a number 123 so basically Alice used 12 matchsticks for this number.

Alice is wondering what is the numerically largest value that she can generate by using at most the matchsticks that she currently possess.Help Alice out by telling her that number.



Input Format:

First line contains T (test cases).

Next T lines contain a Number N.

Output Format:

Print the largest possible number numerically that can be generated using at max that many number of matchsticks which was used to generate N.

Constraints:




*/



import java.util.*;

public class SevenSegmentDisplay {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        String testCaseCounter = s.nextLine();                 // Reading input from STDIN
        initTestCase(Integer.parseInt(testCaseCounter),s);
    }

    public static void initTestCase(int count,Scanner sc){
        for(int pos = 0; pos < count ; pos++){
            String number = sc.nextLine();
            matchCounterFun(number);
        }
    }

    public static void matchCounterFun(String data){
        int numVal[] = {6,2,5,5,4,5,6,3,7,6};
        char []numData = data.toCharArray();
        int matchStickCount = 0;
        for(int i = 0; i < numData.length; i ++){
            matchStickCount = matchStickCount + numVal[numData[i] - '0'];
        }

        highestNumFun(matchStickCount);
    }

    public static void highestNumFun(int count){
        int finalVal = count / 2 ;
//            System.out.print("..................."+count+"......"+finalVal);

        if (count % 2 == 0)
            System.out.print("1");
        else
            System.out.print("7");


        for(int pos = 0 ; pos < finalVal-1 ; pos ++){
            System.out.print("1");
        }

        System.out.println("");
    }
}
