package com.hewei.牛客;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int index = str.indexOf(".");
        int intNum = Integer.parseInt(str.substring(0, index));
        int floatNum = Integer.parseInt(str.substring(index + 1, index + 2));
        System.out.println(floatNum >= 5 ? ++intNum : intNum);
    }
}
