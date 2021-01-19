package com.hewei.niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ten {
    public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String str = in.readLine();
            StringBuilder sb = new StringBuilder();
            char[] arr = str.toCharArray();
            int count = 0;
            for (char c : arr) {
                if (sb.toString().indexOf(c) == -1) {
                    count++;
                    sb.append(c);
                }
            }
            System.out.println(count);
    }
}
