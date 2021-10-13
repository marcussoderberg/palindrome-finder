package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] palindrome = new String[]{"civic", "keyboard", "deified", "monkey", "radar", "greedy", "fries", "level"};


        for (String s : palindromeFinder(palindrome)) {
            System.out.println(s);
        }

    }

    public static String[] palindromeFinder(String[] arr) {
        List<String> tempPalindrome = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            char[] charArr = arr[i].toCharArray();
            int last = charArr.length - 1;
            int palindromeCounter = 0;
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[j] == charArr[last]) {
                    palindromeCounter++;
                    last--;
                }
                if (palindromeCounter == charArr.length) {
                    tempPalindrome.add(arr[i]);
                }
            }
        }
        String[] palindromeArr = new String[tempPalindrome.size()];
        for (int i = 0; i < palindromeArr.length; i++) {
            palindromeArr[i] = tempPalindrome.get(i);
        }
        return palindromeArr;
    }
}
