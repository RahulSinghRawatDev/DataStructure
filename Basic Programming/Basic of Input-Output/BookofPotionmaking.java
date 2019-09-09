package com.vuscreen;

/*Harry wants to find Voldemort's potion making book but he is confused about how to get it.

The book has a special ISBN(International Standard Book Number) which is  unique numeric book identifier only for Voldemort's book printed on it. The ISBN is based upon a 10-digit code. The ISBN is valid if:
1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9 + 10xdigit10 is divisible by 11.
Help Harry to find the book!
Input:
 Input the ISBN code as a 10-digit integer.

Output:
If the ISBN is not a 10-digit integer, output the message “Illegal ISBN” and terminate the program.
If the number is 10-digit, extract the digits of the number and compute the sum as explained in the explanation.
If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not divisible by 11, output the message, “Illegal ISBN”.*/

import java.util.Scanner;

class BookofPotionmaking {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        String inputData = s.nextLine();                 // Reading input from STDIN
        splitFun(inputData);
    }

    public static void splitFun(String data) {
        char[] stringToArray = data.toCharArray();
        printFunc(stringToArray.length, stringToArray);
    }

    public static void printFunc(int n, char[] arr) {
        int sum = 0;
        int arrPos = 0;
        for (int pos = 1; pos <= n; pos++) {
            int data = Character.getNumericValue(arr[arrPos]);
            sum = sum + pos * data;
            arrPos++;
        }
        if (sum % 11 == 0) {
            System.out.println("Legal ISBN");
        } else {
            System.out.println("Illegal ISBN");
        }
    }
}
