package com.hewei.回文数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(in.readLine());
//        if (x < 0) {
//            System.out.println(false);
//        }
//        if (x < 10) {
//            System.out.println(true);
//        }
//        String str = x + "";
//        int start = 0;
//        int end = str.length() - 1;
//        while (str.charAt(start) == str.charAt(end) && start < end) {
//            if (end - start <= 2) {
//                System.out.println(true);
//                return;
//            }
//            start++;
//            end--;
//        }
//        System.out.println(false);

        /* 官方 */
        if(x < 0)
            System.out.println(false);
           // return false;
        int cur = 0;
        int num = x;
        while(num != 0) {
            cur = cur * 10 + num % 10;
            num /= 10;
        }
        System.out.println(cur == x);
        // return cur == x;
    }
}
