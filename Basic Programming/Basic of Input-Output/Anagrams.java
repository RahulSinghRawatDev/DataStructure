package com.vuscreen;
/*
Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

Input :

test cases,t
two strings a and b, for each test case
Output:

Desired O/p

Constraints :

string lengths<=10000

Note :

Anagram of a word is formed by rearranging the letters of the word.

For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.
*/


/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Anagrams {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int inputCount = Integer.parseInt(s.nextLine());
        inputDataLoopFunc(s,inputCount);
    }

    public static void inputDataLoopFunc(Scanner s,int inputCount){
        for(int pos = 0;pos< inputCount;pos++){
            String val1 = s.nextLine();
            String val2 = s.nextLine();
            splitFun(val1,val2);
        }
    }

    public static void splitFun(String val1,String val2){
        char arr1[] =  val1.toCharArray();
        char arr2[] =  val2.toCharArray();
        int totalArr1Size = arr1.length;
        int totalArr2Size = arr2.length;
        int count = 0;
        for(int arr1Pos = 0;arr1Pos < arr1.length ; arr1Pos ++)
        {

            int arrTwoDelPos = checkElement(arr1[arr1Pos],arr2);

            if(arrTwoDelPos == -1){

            }else{

                count ++;
/*            arr1 = removeDataFun(arr1Pos,arr1);
            arr2 = removeDataFun(arrTwoDelPos,arr2);
*/
                arr2 = removeDataFun(arrTwoDelPos,arr2);

            }

        }


//   System.out.println(count+"..."+arr1.length+"...."+arr2.length);

        int totalElementsDelete = arr1.length + arr2.length - count;
        System.out.println(totalElementsDelete);


    }

    public static int checkElement(char data, char bData[]) {
        int isAvailable = -1;
        for (int pos = 0; pos < bData.length; pos++) {
            if (data == bData[pos]) {
                isAvailable = pos;
            }
        }
        return isAvailable;
    }

    private static char[] removeDataFun(int removePos, char[] arrData) {
        char tempChar[] = new char[arrData.length-1];
        int tempCharPos = 0;
        //   System.out.println(">>>>>>"+String.copyValueOf(arrData)+"....."+arrData.length);
        for(int i = 0 ; i < arrData.length ; i ++){


            if(i == removePos)
            {

            }else{
                tempChar[tempCharPos] = arrData[i];
                tempCharPos ++;
            }

        }
        arrData = tempChar;
        //      System.out.println("<<<<<<"+String.copyValueOf(arrData)+"....."+arrData.length);
        return arrData;
    }
}

