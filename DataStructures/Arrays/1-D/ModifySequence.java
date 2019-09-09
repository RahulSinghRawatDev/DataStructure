

/*
Suppose we have a sequence of non-negative integers, Namely a_1, a_2, ... ,a_n. At each time we can choose one term a_i with 0 < i < n and we subtract 1 from both a_i and a_i+1. We wonder whether we can get a sequence of all zeros after several operations.

Input

The first line of test case is a number N. (0 < N <= 10000) The next line is N non-negative integers, 0 <= a_i <= 109

Output

If it can be modified into all zeros with several operations output “YES” in a single line, otherwise output “NO” instead.

Explanation
It is clear that [1 2] can be reduced to [0 1] but no further to convert all integers to 0. Hence, the output is NO.

Consider another input for more clarification:

2
2 2

Output is YES as [2 2] can be reduced to [1 1] and then to [0 0] in just two steps.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
class ModifySequence {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String numbers = br.readLine();
        seperator(numbers,N);
   }
    
    public static void seperator(String numbers,int N){
        String[] parts = numbers.split(" ");
        parameters(parts,N);
    }
    
    public static void parameters(String[] parts,int size){
        int val = 0;
        for (int pos = 0; pos<size ;pos++){
            val = Integer.parseInt(parts[pos]) - val;               
        } 
          if(val == 0)
          System.out.println("YES");
          else
          System.out.println("NO");   
    }
}

