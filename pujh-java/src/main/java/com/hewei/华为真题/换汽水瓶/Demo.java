package com.hewei.华为真题.换汽水瓶;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 三个瓶子换一瓶汽水
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while ((n = Integer.parseInt(in.readLine())) > 0) {
            if (n < 3) {
                System.out.println(n);
                continue;
            }
            //  空瓶子
            int m = n;
            while (m >= 3) {
                n += m / 3;
                m = m / 3 + m % 3;
            }
            if (m == 2) {
                n++;
            }
            System.out.println(n);
        }
    }
}
