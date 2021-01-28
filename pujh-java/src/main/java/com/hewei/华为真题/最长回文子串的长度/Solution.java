package com.hewei.华为真题.最长回文子串的长度;

/**
 * 对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。
 * 给定字符串A以及它的长度n，请返回最长回文子串的长度。
 * "abc1234321ab",12
 * <p>
 * 7
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getLongestPalindrome("abc1234321ab",12));
    }

    public static int getLongestPalindrome(String A, int n) {
        if (n == 0) {
            return 0;
        }
        char[] strArr = A.toCharArray();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int start = i - 1;
            int end = i;
            // ABBA型
            while (start >= 0 && end < n && strArr[start] == strArr[end]) {
                count = Math.max(count, end - start + 1);
                start--;
                end++;
            }
            // ABA
            start = i - 1;
            end = i + 1;
            while (start >= 0 && end < n && strArr[start] == strArr[end]) {
                count = Math.max(count, end - start + 1);
                start--;
                end++;
            }
        }
        return count;
    }
}
