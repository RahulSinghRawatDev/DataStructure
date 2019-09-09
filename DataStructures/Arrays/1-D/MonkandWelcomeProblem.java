

/*
Having a good previous year, Monk is back to teach algorithms and data structures. This year he welcomes the learners with a problem which he calls "Welcome Problem". The problem gives you two arrays A and B (each array of size N) and asks to print new array C such that:
 ; 
Now, Monk will proceed further when you solve this one. So, go on and solve it :)

Input:
First line consists of an integer N, denoting the size of A and B.
Next line consists of N space separated integers denoting the array A.
Next line consists of N space separated integers denoting the array B.

Output:
Print N space separated integers denoting the array C.

 Explanation
The output array is the addition of input arrays A and B.
; 
; 
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MonkandWelcomeProblem {
    public static void main(String args[] ) throws Exception {
     Scanner s = new Scanner(System.in);
     String testCaseCount = s.nextLine();                 // Reading input from STDIN
    testCaseFun(Integer.parseInt(testCaseCount),s);
    }
    
    public static void testCaseFun(int testCaseCount,Scanner sc){
             String dataOne = sc.nextLine();
             String dataTwo = sc.nextLine();
            
             String[] arr1 = dataOne.split(" ");
             String[] arr2 = dataTwo.split(" ");
             for(int pos = 0 ;pos < testCaseCount ; pos ++){
                 int val = Integer.parseInt(arr1[pos])+Integer.parseInt(arr2[pos]);
                 System.out.print(val+" ");
             }
    }
}

