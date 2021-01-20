package com.hewei.niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirtyTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            char[] charArr = str.toCharArray();
            int size = 1;
            for (int i = 1; i < charArr.length; i++) {
                int start = i - 1;
                int end = i;
                while (start >= 0 && end < charArr.length && charArr[start] == charArr[end]) {
                    size = Math.max(size, end - start + 1);
                    start--;
                    end++;
                }
                start = i - 1;
                end = i + 1;
                while (start >= 0 && end < charArr.length && charArr[start] == charArr[end]) {
                    size = Math.max(size, end - start + 1);
                    start--;
                    end++;
                }
            }
            System.out.println(size);
        }





        /* 运行超时 无语*/
      /*  while ((str = in.readLine()) != null) {
            char[] charArr = str.toCharArray();
            int length = charArr.length;
            int size = 1;
            char c;
            for (int i = 0; i < length; i++) {
                c = charArr[i];
                int start = i;
                int end;
                while ((end = str.indexOf(c, start + 1)) != -1) {
                    // 判断 ABBA型还是 ABA型
                    int strLength = end - i + 1;
                    // 判断前半截和后半截倒序是否一样
                    StringBuilder sb = new StringBuilder(str.substring(i + strLength / 2, end + 1));
                    if (str.substring(i, i + (int) Math.ceil((double) strLength / 2)).equals(sb.reverse().toString())) {
                        size = Math.max(strLength, size);
                    }
                    start = end;
                }
            }
            System.out.println(size);
        }*/
    }
}