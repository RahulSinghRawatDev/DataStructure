package com.poc.vistaraweb.adapter;


/*
Jack is your friend and Sophia is his girlfriend. But due to some unknown reason ( unknown for us, they know it) Sophia started hating to Jack. Now, Jack is in big trouble but he has a solution, He knows that if he will gift T patterns of a particular type ( For pattern observation see the sample test cases) then Sophia will start loving again to Jack. But Jack is depressed now and need your help to gift her that type patterns of '*' and '#' of N lines. So, it's your responsibility to save your friend's relationship.

        Constraints :

        1 ≤  T ≤ 100

        1 ≤  N ≤ 30

        Input :

        First Line contains T i.e. number of test case.
        Each of the next T lines contain an integer N.

        Output:

        For each test case print the pattern of N lines then after a blank line.
*/



import java.util.*;

public class FriendsRelationship {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String count = s.nextLine();
        initTestCase(Integer.parseInt(count),s);
    }

    public static void initTestCase(int count,Scanner sc){
        for(int pos = 0; pos < count ;pos++){
            patternMaker(Integer.parseInt(sc.nextLine()));
        }
    }


    public static void patternMaker(int patternCount){
        int count = 0;
        for(int i = 0; i <patternCount ; i ++){
            count ++ ;
            for(int j = 0; j < patternCount * 2 ; j++){

                if((j < count) || (j > (patternCount * 2  - (count + 1))))
                    System.out.print("*");
                else
                    System.out.print("#");
            }
            System.out.println("");

        }
        System.out.println("");
    }
}
