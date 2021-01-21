package com.hewei.牛客;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplitStr {
    private static final int maxStr = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            int length = str.length();
            if (length <= maxStr) {
                // 完整的
                for (int i = 0; i < length / 8; i++) {
                    System.out.println(str.substring(i * 8, i * 8 + 8));
                }
                int yushu = length % 8;
                StringBuilder lastStr = new StringBuilder(str.substring((length / 8) * 8));
                if (yushu != 0) {
                   for(int i=0;i< 8-yushu;i++) {
                       lastStr.append("0");
                   }
                    System.out.println(lastStr);
                }
            }
        }
    }
}
