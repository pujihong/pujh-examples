package com.hewei.华为真题.流水线;

import java.math.BigDecimal;

/**
 * 流水线N个产品每个产品有M个零件，Aij表示生产该零件的生产时间
 * 需满足以下2个条件
 * 1. Aij需要生产出来必须保证Ai-1 j先生产出来
 * 2. Aij需要生产出来必须保证Ai j-1先生产出来
 * <p>
 * 测试用例有
 * 1 3
 * 3.0
 * 2.0
 * 1.0
 * 输出6.000000
 * <p>
 * 3 1
 * 3.0 2.0 1.0
 * 输出6.000000
 * <p>
 * 用例3：
 * 2 4
 * 10.000000 5.000000
 * 4.500000 3.000000
 * 4.499999 2.000000
 * 2.000000 1.000000
 * <p>
 * 21.999999
 */
public class Demo {
    public static void main(String[] args) {
        double[][] arr = new double[][]{{10.000000, 5.000000}, {4.500000, 3.000000}, {4.499999, 2.000000}, {2.000000, 1.000000}};
        BigDecimal b = BigDecimal.valueOf(get(arr));
        System.out.println(b.setScale(6, BigDecimal.ROUND_HALF_DOWN));
    }

    public static double get(double[][] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        if (arr.length == 1) {
            for (int i = 0; i < arr[0].length; i++) {
                sum += arr[0][i];
            }
            return sum;
        }
        if (arr[0].length == 1) {
            for (double[] doubles : arr) {
                sum += doubles[0];
            }
            return sum;
        }
        double[][] dp = new double[arr.length][arr[0].length];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1] + dp[0][0];
        dp[1][0] = arr[1][0] + dp[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i < 1 && j < 1) {
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = dp[i - 1][0] + arr[i][j];
                } else if (i == 0) {
                    dp[i][j] = dp[0][j - 1] + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + arr[i][j];
                }
            }
        }
        return dp[arr.length - 1][arr[0].length - 1];
    }
}
