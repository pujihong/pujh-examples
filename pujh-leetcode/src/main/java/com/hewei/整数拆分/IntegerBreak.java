package com.hewei.整数拆分;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1。
 * 示例 2:
 * <p>
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36。
 * 说明: 你可以假设 n 不小于 2 且不大于 58。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-break
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class IntegerBreak {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(get(Integer.parseInt(in.readLine())));
    }

    public static int get(int num) {
        if (num == 2) {
            return 1;
        }
        if (num == 3) {
            return 2;
        }
        int count = num / 3;
        int n = num % 3;
        if (n == 1) {  // 余数 = 1 拆分成 2 * 2
            return (int) Math.pow(3, count - 1) * 4;
        } else if (n == 2) {
            return (int) Math.pow(3, count) * n;
        } else {
            return (int) Math.pow(3, count);
        }
    }
}
