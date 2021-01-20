package com.hewei.Z字形变换;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convert {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int rowNum;
        String s;
        while ((s = in.readLine()) != null) {
            rowNum = Integer.parseInt(s);
            if (rowNum < 1 || rowNum > 1000) {
                throw new IOException("输入报错");
            }
            String str = in.readLine();
            if (rowNum == 1) {
                System.out.println(str);
                return;
            }
            StringBuilder[] sbArr = new StringBuilder[rowNum];
            for (int i = 0; i < rowNum; i++) {
                sbArr[i] = new StringBuilder();
            }
            /* 以斜着的V为一个周期除了上下各一个*/
            int n = 2 * rowNum - 2;
            // 一行一行的读
            for (int i = 0; i < str.length(); i++) {
                int index = i % n;
                // Math.min(n-index,index)要出来好理解
                sbArr[Math.min(n - index, index)].append(str.charAt(i));
            }
            StringBuilder result = new StringBuilder();
            for (StringBuilder stringBuilder : sbArr) {
                result.append(stringBuilder.toString());
            }
            System.out.println(result);

        }
    }
}
