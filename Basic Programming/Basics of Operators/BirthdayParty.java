package com.vuscreen;

/*
Mr. X's birthday is in next month. This time he is planning to invite N of his friends. He wants to distribute some chocolates to all of his friends after party. He went to a shop to buy a packet of chocolates.
At chocolate shop, each packet is having different number of chocolates. He wants to buy such a packet which contains number of chocolates, which can be distributed equally among all of his friends.
Help Mr. X to buy such a packet.

Input:
First line contains T, number of test cases.
Each test case contains two integers, N and M. where is N is number of friends and M is number number of chocolates in a packet.

Output:
In each test case output "Yes" if he can buy that packet and "No" if he can't buy that packet.

Constraints:
1<=T<=20
1<=N<=100
1<=M<=10^5

Problem Setter:
Akash Rakshit

*/
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class  BirthdayParty {
     public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String testCaseCount = s.nextLine();                 // Reading input from STDIN
        testCaseLoopFun(Integer.parseInt(testCaseCount),s);
    }
    
    public static void testCaseLoopFun(int count,Scanner sc){
       for(int i = 0;i < count ; i++){
           String data = sc.nextLine();
           int peopleCount = Integer.parseInt(data.split(" ")[0]);
           int packetCount = Integer.parseInt(data.split(" ")[1]);           
           if(packetCount % peopleCount == 0){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
           
       }    
    }
    
}


