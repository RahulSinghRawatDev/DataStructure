package com.vuscreen;

/*You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.

        Input Format
        The first and only line of input contains 3 space separated integers l, r and k.

        Output Format
        Print the required answer on a single line.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class CountDivisors {

    public static void seperator(String numbers){
        String[] parts = numbers.split(" ");
        String part1 = parts[0]; // 004
        String part2 = parts[1]; // 034556
        String part3 = parts[2];

        int count = 0;
        for(int i = Integer.parseInt(parts[0]);i<=Integer.parseInt(parts[1]);i++)
        {
            if(i%Integer.parseInt(part3) ==0)
                count++;

        }

        System.out.println(count);

    }



    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
//        int L = Integer.parseInt(line);
        //	String numbers = br.readLine();

        seperator(line);
    }
}

