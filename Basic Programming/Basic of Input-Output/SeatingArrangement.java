package com.vuscreen;

/*
Akash and Vishal are quite fond of travelling. They mostly travel by railways. They were travelling in a train one day and they got interested in the seating arrangement of their compartment. The compartment looked something like


        So they got interested to know the seat number facing them and the seat type facing them. The seats are denoted as follows :

        Window Seat : WS
        Middle Seat : MS
        Aisle Seat : AS

        You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.

        INPUT
        First line of input will consist of a single integer T denoting number of test-cases. Each test-case consists of a single integer N denoting the seat-number.

        OUTPUT
        For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line.

        CONSTRAINTS
        1<=T<=105
        1<=N<=108*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SeatingArrangement {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long times = Long.parseLong(st.nextToken());
        int i = 0;
        while(i < times)
        {	funOutput(Integer.parseInt(br.readLine()));
            i++;
        }
    }


    public static void funOutput(int sampleNo){
        switch(sampleNo%12){
            case 1:
                System.out.println((sampleNo+11)+" WS");
                break;
            case 2:
                System.out.println((sampleNo+9)+" MS");
                break;
            case 3:
                System.out.println((sampleNo+7)+" AS");
                break;
            case 4:
                System.out.println((sampleNo+5)+" AS");
                break;
            case 5:
                System.out.println((sampleNo+3)+" MS");
                break;
            case 6:
                System.out.println((sampleNo+1)+" WS");
                break;
            case 7:
                System.out.println((sampleNo-1)+" WS");
                break;
            case 8:
                System.out.println((sampleNo-3)+" MS");
                break;
            case 9:
                System.out.println((sampleNo-5)+" AS");
                break;
            case 10:
                System.out.println((sampleNo-7)+" AS");
                break;
            case 11:
                System.out.println((sampleNo-9)+" MS");
                break;
            case 0:
                System.out.println((sampleNo-11)+" WS");
                break;
        }

    }
}

