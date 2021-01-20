package com.hewei.最长字串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        /* 效率低 内存高*/
      /*  while ((str = in.readLine()) != null) {
            char[] charArr = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (char c : charArr) {
                if (sb.toString().indexOf(c) == -1) {
                    sb.append(c);
                    count = Math.max(count, sb.toString().length());
                } else {
                    int index = sb.toString().indexOf(c);
                    sb = new StringBuilder(sb.substring(index + 1)).append(c);
                }
            }
            System.out.println(count);
        }*/

        // 操作字符串 改用指针
        while ((str = in.readLine()) != null) {
            Map<Character, Integer> map = new HashMap<>();
            int count = 0;
            int start = 0;
            int length = str.length();
            char c;
            for (int i = 0; i < length; i++) {
                c = str.charAt(i);
                if (map.containsKey(c)) {
                    start = Math.max(map.get(c) + 1, start);
                }
                map.put(c, i);
                count = Math.max(count, i - start + 1);
            }
            System.out.println(count);
        }
    }

}
