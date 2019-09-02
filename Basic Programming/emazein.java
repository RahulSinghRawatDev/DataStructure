package com.vuscreen;


/*Ankit is in maze. The command center sent him a string which decodes to come out from the maze. He is initially at (0, 0). String contains L, R, U, D denoting left, right, up and down. In each command he will traverse 1 unit distance in the respective direction.

        maze

        For example if he is at (2, 0) and the command is L he will go to (1, 0).

        Input:

        Input contains a single string.

        Output:

        Print the final point where he came out*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
class emazein {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        splitName(name);
    }

    public static void splitName(String input){
        char [] splitData = input.toCharArray();
        outputFun(splitData);
    }

    public static void outputFun(char[] data){
        int x = 0;
        int y = 0;

        for(int pos = 0;pos < data.length ;pos ++){
            switch(data[pos]){
                case 'L':
                    x = x - 1;
                    break;
                case 'R':
                    x = x + 1;
                    break;
                case 'U':
                    y = y + 1;
                    break;
                case 'D':
                    y = y-1;
                    break;
            }
        }
        System.out.println(x+" "+y);
    }
}

