package com.vuscreen;

/*Patlu and Motu works in a building construction, they have to put some number of bricks N from one place to another, and started doing their work. They decided , they end up with a fun challenge who will put the last brick.

        They to follow a simple rule, In the i'th round, Patlu puts i bricks whereas Motu puts ix2 bricks.

        There are only N bricks, you need to help find the challenge result to find who put the last brick.

        Input:

        First line contains an integer N.

        Output:

        Output "Patlu" (without the quotes) if Patlu puts the last bricks ,"Motu"(without the quotes) otherwise.

        Constraints:

        1 ≤ N ≤ 10000*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class BrickGame {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String bricksCount = s.nextLine();
        winnerFun(Integer.parseInt(bricksCount));
    }

    public static void winnerFun(int bricksCount){
        int sum = 0;
        for(int pos = 1 ; pos < bricksCount ; pos ++){
            sum = sum + pos ;
            if(sum>=bricksCount){
                System.out.println("Patlu");
                break;
            }
            sum = sum + pos * 2;
            if(sum>=bricksCount){
                System.out.println("Motu");
                break;
            }


        }
    }
}

