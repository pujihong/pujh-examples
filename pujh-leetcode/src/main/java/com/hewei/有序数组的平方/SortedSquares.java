package com.hewei.有序数组的平方;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int[] result = get(new int[]{-4, -1, 0, 3, 10});
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    public static int[] get(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }
}

