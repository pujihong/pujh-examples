package com.hewei.牛客;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Eight {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int num = Integer.parseInt(str);
            Map<Integer, Integer> map = new TreeMap<>();
            int key;
            int value;
            String input;
            for (int i = 0; i < num; i++) {
                input = in.readLine();
                key = Integer.parseInt(input.split(" ")[0]);
                value = Integer.parseInt(input.split(" ")[1]);
                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + value);
                } else {
                    map.put(key, value);
                }
            }
            for (Integer k : map.keySet()) {
                System.out.println(k + " " + map.get(k));
            }
        }
    }
}
