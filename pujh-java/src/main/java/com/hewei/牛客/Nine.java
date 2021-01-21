package com.hewei.牛客;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nine {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            if (sb.toString().indexOf(arr[i]) == -1) {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
