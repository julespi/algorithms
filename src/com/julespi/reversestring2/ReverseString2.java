package com.julespi.reversestring2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String aString = reader.readLine();
        reverseAString(aString);
    }

    public static void reverseAString(String aString) {
        StringBuilder copy = new StringBuilder(aString);
        int left = 0;
        int right = aString.length()-1;
        while(left != right){
            if(isALetter(copy.charAt(left))){
                if(isALetter(copy.charAt(right))){
                    char temp = copy.charAt(right);
                    copy.setCharAt(right,copy.charAt(left));
                    copy.setCharAt(left,temp);
                    right--;
                    left++;
                }else{
                    right--;
                }
            }else{
                left++;
            }

        }
        System.out.println(copy);
    }

    public static boolean isALetter(char character) {
        return (character <= 'z' && character >= 'A');
    }
}
