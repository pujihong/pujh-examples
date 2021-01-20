package com.hewei.最长回文子串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null) {
            char[] charArr = s.toCharArray();
            String result = s.substring(0,1);
            String temp;
            for (int i = 1; i < charArr.length; i++) {
                int start = i - 1;
                int end = i;
                // ABBA型
                while (start >= 0 && end < charArr.length && charArr[start] == charArr[end]) {
                    temp = s.substring(start, end + 1);
                    if (result.length() < temp.length()) {
                        result = s.substring(start, end + 1);
                    }
                    start--;
                    end++;
                }
                // ABA型
                start = i - 1;
                end = i + 1;
                while (start >= 0 && end < charArr.length && charArr[start] == charArr[end]) {
                    temp = s.substring(start, end + 1);
                    if (result.length() < temp.length()) {
                        result = s.substring(start, end + 1);
                    }
                    start--;
                    end++;
                }
            }
            System.out.println(result);
        }
    }
}
