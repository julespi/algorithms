package com.julespi.reversestring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String aString = reader.readLine();;
        reverseAString(aString);
    }

    public static void reverseAString(String aString){
        String[] palabras = aString.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(String palabra: palabras){
            for(int i=palabra.length()-1; i>=0 ;i--){
                reversed.append(palabra.charAt(i));
            }
            reversed.append(" ");
        }
        reversed.deleteCharAt(reversed.length()-1);
        System.out.println(reversed);
    }
}
