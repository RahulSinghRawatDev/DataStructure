package com.vuscreen.service;

/*You live in a village. The village can be represented as a line that contains  grids. Each grid can be denoted as a house that is marked as  or a blank space that is marked as .

        A person lives in each house. A person can move to a grid if it is adjacent to that person. Therefore, the grid must be present on the left and right side of that person.

        Now, you are required to put some fences that can be marked as  on some blank spaces so that the village can be divided into several pieces. A person cannot walk past a fence but can walk through a house.

        You are required to divide the house based on the following rules:

        A person cannot reach a house that does not belong to that specific person.
        The number of grids each person can reach is the same and it includes the grid in which the house is situated.
        In order to show that you are enthusiastic and if there are many answers, then you are required to print the one where most fences are placed.
        Your task is to decide whether there is a possible solution. Print the possible solution.

        Input format

        First line: An integer  that represents the number of grids ()
        Second line:  characters that indicate the villages that are represented as  or
        Output format

        The output must be printed in the following format:

        First line: If possible, then print . Otherwise, print .
        Second line: If the answer is , then print the way to do so.
        SAMPLE INPUT
        5
        H...H
        SAMPLE OUTPUT
        YES
        HBBBH
        Explanation
        Each person can reach 1 grid. Each person can reach his own houses only.

        Note that HB.BH also works. Each person can reach only 1 grid.

        But H..BH does not work. Because the first person can reach 3 grids but the second one can only reach 1.

        H...H does not work either. The first person can reach the second person's house which is bad.

        So you need to print HBBBH because it has the most fences*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//import for Scanner and other utility classes
import java.util.*;

class SplitHouse {
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
        String gridVal = s.nextLine();                 // Reading input from STDIN

        String name = s.nextLine();                 // Reading input from STDIN

        //    System.out.println(gridVal);

        checkInputValFun(name);

        //   System.out.println(name);
    }

    public static void checkInputValFun(String name){
        char[] data = name.toCharArray();
        int hCount = 0;
        int dotCount = 0;
        String oldVal = null;
        StringBuilder valData = new StringBuilder();

        for(int pos = 0;pos < data.length;pos++){


            if(data[pos] == 'H'){
                hCount = hCount + 1;
                valData.append("H");



//                return;

            }

            else{
                dotCount = dotCount + 1;
                valData.append("B");
            }
            //      System.out.println(oldVal+">>>>"+data[pos]+"<<<<");


            if(oldVal == null)
                oldVal = Character.toString(data[pos]);
            else if(oldVal.equals(Character.toString(data[pos]))&& (data[pos] == 'H'))
                hCount = 100;
            else
                oldVal = Character.toString(data[pos]);


        }

        if(hCount == 100){
            System.out.println("NO");
        }else{
            System.out.println("YES");
            System.out.println(valData.toString());

        }


    }

}

