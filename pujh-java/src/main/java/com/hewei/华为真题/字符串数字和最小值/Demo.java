package com.hewei.华为真题.字符串数字和最小值;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 求字符串出现数字和的最小值，会有负数
 * 字符串格式：a-zA-Z±
 * 示例:abc12ss-123b
 * 最小值：1+2+（-123）= -120
 * <p>
 * ab0c12ss-123b-1ss+dd–g1g
 * -120
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = in.readLine()) != null) {
            char[] charArr = str.toCharArray();
            /* 整数 每个数相加,tempNum只存负数*/
            int tempNum = 0;
            int sum = 0;
            for (int i = 0; i < charArr.length; i++) {
                //  Character.isDigit(charArr[i]);
                if ('0' <= charArr[i] && charArr[i] <= '9') { // 判断是否是数字
                    // 判断是负数
                    if (i != 0 && charArr[i - 1] == '-') { // 负数
                        tempNum = Integer.parseInt(String.valueOf(charArr[i])) * -1;
                    } else {
                        if (tempNum == 0) { // 前面不是负数
                            sum += Integer.parseInt(String.valueOf(charArr[i]));
                        } else {
                            tempNum = tempNum * 10 - Integer.parseInt(String.valueOf(charArr[i]));
                        }
                    }
                } else {
                    if (tempNum < 0) {
                        sum += tempNum;
                        tempNum = 0;
                    }
                }
            }
            if (tempNum < 0) {
                sum += tempNum;
            }
            System.out.println(sum);
        }
    }
}
