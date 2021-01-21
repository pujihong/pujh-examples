package com.hewei.牛客;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LastWordLength {
    private static final int max = 5000;

    private static int lengthOfLast(String word) {
        if (word == null || word.equals("")) {
            return 0;
        }
        if (word.length() > max) {
            return 0;
        }
        String[] strArr = word.split(" ");
        return strArr[strArr.length - 1].length();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        System.out.println(lengthOfLast(word));
    }
}
