package com.vuscreen;

/*You are conducting a contest at your college. This contest consists of two problems and  participants. You know the problem that a candidate will solve during the contest.

        You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant by performing the following operation:

        Use green-colored balloons for the first problem and purple-colored balloons for the second problem
        Use purple-colored balloons for the first problem and green-colored balloons for the second problem
        You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.

        Input format

        First line:  that denotes the number of test cases ()
        For each test case:
        First line: Cost of green and purple-colored balloons
        Second line:  that denotes the number of participants ()
        Next  lines: Contain the status of users. For example, if the value of the  integer in the  row is , then it depicts that the  participant has not solved the  problem. Similarly, if the value of the  integer in the  row is , then it depicts that the  participant has solved the  problem.
        Output format
        For each test case, print the minimum cost that you have to pay to purchase balloons.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
class CostofBallon {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        String textCaseCount = s.nextLine();                 // Reading input from STDIN
        textCaseLoopFun(Integer.parseInt(textCaseCount),s);
    }

    public static void textCaseLoopFun(int loopCount,Scanner sc){
        for (int innerCount = 0;innerCount < loopCount ; innerCount++){
            String ballonVal = sc.nextLine();
            String inputCount = sc.nextLine();


            inputCountFun(ballonVal,Integer.parseInt(inputCount),sc);



        }
    }

    public static void inputCountFun(String ballonVal,int inputCountVal,Scanner input){
        //  char [] ballonValData = ballonVal.toCharArray();
        String [] ballonValData = ballonVal.split(" ");
        int greenBallonCount = Integer.parseInt(ballonValData[0]);
        int purpleBallonCount = Integer.parseInt(ballonValData[1]);
        int leftCount = 0;
        int rightCount = 0;

        for (int inputCount = 0; inputCount < inputCountVal; inputCount++){
            String data = input.nextLine();
            String [] splitData = data.split(" ");

            int leftData = Integer.parseInt(splitData[0]);
            int rightData = Integer.parseInt(splitData[1]);

            leftCount = leftCount + leftData;
            rightCount = rightCount + rightData;

            //     System.out.println(data +" <<<<< "+inputCountVal+">>>>>"+ballonVal);

        }

        int minVal = 0;

        if(greenBallonCount < purpleBallonCount){ // greenBallonCount is less that purpleBallonCount
            if(leftCount < rightCount){
                minVal = leftCount * purpleBallonCount + rightCount * greenBallonCount;
            }else if(leftCount > rightCount){
                minVal = rightCount * purpleBallonCount + leftCount * greenBallonCount;
            }else{
                minVal = rightCount * purpleBallonCount + leftCount * greenBallonCount;
            }
        }else{ // greenballon are big
            if(leftCount < rightCount){
                minVal = rightCount * purpleBallonCount + leftCount * greenBallonCount;
            }else if(leftCount > rightCount){
                minVal = leftCount * purpleBallonCount + rightCount * greenBallonCount;
            }else{
                minVal = leftCount * purpleBallonCount + rightCount * greenBallonCount;
            }
        }
        System.out.println(minVal);

    }
}

