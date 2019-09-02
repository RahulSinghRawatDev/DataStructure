package com.vuscreen;


/*Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.
* */

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class lifetheuniverseandeverything {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String value = br.readLine();
            if(!value.equals("42"))
                sb.append(value+"\n");
            else
                break;

        }
        System.out.println(sb);

    }
}

