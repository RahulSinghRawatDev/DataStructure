package com.vuscreen;
/*
You have been given an array A of size N consisting of positive integers. You need to find and print the product of all the number in this array Modulo .

        Input Format:
        The first line contains a single integer N denoting the size of the array. The next line contains N space separated integers denoting the elements of the array

        Output Format:
        Print a single integer denoting the product of all the elements of the array Modulo .

        Constraints:

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

class FindProduct {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
//		pow(count,4);
        funCounter(count,br);
    }

    public static void funCounter(int count,BufferedReader br) throws Exception{
        String data = br.readLine();
        funSplit(data,count);
    }

    public static void funSplit(String data,int count){
        String[] splitName = data.split(" ");
        int[] arr = new int[count];
        for(int i = 0 ;i < count ; i++){
            arr[i] = Integer.parseInt(splitName[i]);
        }
        funFinalOperation(arr,count);
    }

    public static void funFinalOperation(int[] ch,int count){
        long answer = 1;
        long power = 1000000007;
        for(int i = 0;i<count;i++){
            answer = (answer*ch[i])%(power);
        }
        System.out.println(answer);
    }
}

