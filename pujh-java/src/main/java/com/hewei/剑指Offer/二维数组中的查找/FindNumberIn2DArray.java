package com.hewei.剑指Offer.二维数组中的查找;

public class FindNumberIn2DArray {
    public static void main(String[] args) {
        System.out.println(get(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 16));
    }

    public static boolean get(int[][] matrix, int target) {
// 暴力
//        for (int[] ints : matrix) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (ints[j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
        // 这里选择左下角和右上角都可以
        int i = matrix.length - 1;
        if (i < 0) {
            return false;
        }
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }
}
