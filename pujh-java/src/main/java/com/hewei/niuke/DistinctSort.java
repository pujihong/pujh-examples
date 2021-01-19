package com.hewei.niuke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class DistinctSort {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            TreeSet<Integer> set = new TreeSet<>();
            int num = Integer.parseInt(str); // 数量
            if (num > 0 && num <= 1000) {
                for (int i = 0; i < num; i++) {
                    set.add(Integer.parseInt(in.readLine()));
                }
            }
            for (int i : set) {
                System.out.println(i);
            }
        }
    }
}