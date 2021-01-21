package com.hewei.牛客;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharNum {
    private static int charNum(String word, char target) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String word = in.readLine().toLowerCase();
        char target = in.readLine().toLowerCase().charAt(0);
        System.out.println(charNum(word, target));
    }
}
