package com.vuscreen;

/*Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
        Minimum dimension of the picture can be L x L, where L is the length of the side of square.

        Now Roy has N photos of various dimensions.
        Dimension of a photo is denoted as W x H
        where W - width of the photo and H - Height of the photo

        When any photo is uploaded following events may occur:

        [1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
        [2] If width and height, both are large enough and
        (a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
        (b) else user is prompted to crop it. Print "CROP IT" in this case.

        (quotes are only for clarification)

        Given L, N, W and H as input, print appropriate text as output.

        Input:
        First line contains L.
        Second line contains N, number of photos.
        Following N lines each contains two space separated integers W and H.

        Output:
        Print appropriate text for each photo in a new line.

        Constraints:
        1 <= L,W,H <= 10000
        1 <= N <= 1000*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
class RoyAndProfileProblem {

    public static void parameters(int width, int height,int L){

        if(width<L|| height<L)
        {
            System.out.println("UPLOAD ANOTHER");
        }else{
            if(width == L && height == L){
                System.out.println("ACCEPTED");
            }else if (width == height){
                System.out.println("ACCEPTED");
            }else{
                System.out.println("CROP IT");

            }
        }
    }

    public static void seperator(List<String> categoryList,int L){
        for(int i = 0 ;i<categoryList.size(); i++){
            String[] parts = categoryList.get(i).split(" ");
            String part1 = parts[0]; // 004
            String part2 = parts[1]; // 034556
            parameters(Integer.parseInt(part1),Integer.parseInt(part2),L);
        }


    }


    public static void main(String args[] ) throws Exception {
        List<String> categoryList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int L = Integer.parseInt(line);

        String line1 = br.readLine();
        int N = Integer.parseInt(line1);

        for(int i = 0 ;i < N; i ++)
        {
            String word = br.readLine();
            categoryList.add(word);
        }

        seperator(categoryList,L);
    }
}

