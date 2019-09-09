package com.vuscreen;


/*Goki recently had a breakup, so he wants to have some more friends in his life. Goki has N people who he can be friends with, so he decides to choose among them according to their skills set Yi(1<=i<=n). He wants atleast X skills in his friends.
        Help Goki find his friends.

        INPUT
        First line of the input contains an integer N denoting the number of people.

        Next line contains a single integer X - denoting the minimum skill required to be Goki's friend.

        Next n lines contain one integer Y - denoting the skill of ith person.

        OUTPUT
        For each person print if he can be friend with Goki. 'YES' (without quotes) if he can be friends with Goki else 'NO' (without quotes).

        CONSTRAINTS

        1<=N<=1000000
        1<=X,Y<=1000000*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;
class Gokiandhisbreakup {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String skillCount = s.nextLine();                 // Reading input from STDIN
        String minSkillCount = s.nextLine();                 // Reading input from STDIN
        friendCountFun(s,Integer.parseInt(skillCount),Integer.parseInt(minSkillCount));

    }


    public static void friendCountFun(Scanner sc,int skillCount,int minSkillCount){
        for(int pos = 0;pos < skillCount ; pos ++){
            String personSkillCount = sc.nextLine();
            if(minSkillCount <= Integer.parseInt(personSkillCount))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}

