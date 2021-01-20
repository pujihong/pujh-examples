package com.hewei.转置矩阵;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[j][i] = a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
