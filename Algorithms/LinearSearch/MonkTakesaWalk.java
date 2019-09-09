package com.vuscreen;

/*
Today, Monk went for a walk in a garden. There are many trees in the garden and each tree has an English alphabet on it. While Monk was walking, he noticed that all trees with vowels on it are not in good state. He decided to take care of them. So, he asked you to tell him the count of such trees in the garden.
Note : The following letters are vowels: 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o' and 'u'.

Input:
The first line consists of an integer T denoting the number of test cases.
Each test case consists of only one string, each character of string denoting the alphabet (may be lowercase or uppercase) on a tree in the garden.

Output:
For each test case, print the count in a new line.*/
 
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MonkTakesaWalk {
      public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String testCaseCount = s.nextLine();                 // Reading input from STDIN
        testCaseCounter(Integer.parseInt(testCaseCount),s);
    }
    
    public static void testCaseCounter(int testCount , Scanner sc){
        for(int pos = 0; pos < testCount; pos++){
            String userInput = sc.nextLine();                 // Reading input from STDIN
            vowelChecker(userInput);
        }
    }
    
    public static void vowelChecker(String data){
        char[] alphabet = data.toCharArray();
        int count = 0;
        for(int pos = 0; pos < alphabet.length; pos++){
            switch(alphabet[pos]){
                case 'A':
                    count++;
                    break;
                case 'E':
                    count++;
                    break;
                case 'I':
                    count++;
                    break;
                case 'O':
                    count++;
                    break;
                case 'U':
                    count++;
                    break;
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;

            }
        }
        
        System.out.println(count);
    }
}


