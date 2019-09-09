package com.vuscreen;


/*Indian army is going to do a surprise attack on one of its enemies country. The President of India, the Supreme Commander of the Indian Army will be sending an alert message to all its commanding centers. As enemy would be monitoring the message, Indian army is going to encrypt(cipher) the message using basic encryption technique. A decoding key 'K' (number) would be sent secretly.

        You are assigned to develop a cipher program to encrypt the message. Your cipher must rotate every character in the message by a fixed number making it unreadable by enemies.

        Given a single line of string 'S' containing alpha, numeric and symbols, followed by a number '0<=N<=1000'. Encrypt and print the resulting string.

        Note: The cipher only encrypts Alpha and Numeric. (A-Z, a-z, and 0-9) . All Symbols, such as - , ; %, remain unencrypted.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Cipher {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        int keyData = Integer.parseInt(br.readLine());
        char[] input = inputData.toCharArray();
        for (int i = 0; i < inputData.length(); i++) {
            funEncrypt(input[i], keyData);
        }
    }

    public static void funEncrypt(char ch, int key) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') {
            int finalCharacter = (int) ch + key;
            System.out.print((char) finalCharacter);
        } else {
            System.out.print(ch);
        }

    }
}

