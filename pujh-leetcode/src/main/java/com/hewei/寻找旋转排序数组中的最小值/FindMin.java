package com.hewei.寻找旋转排序数组中的最小值;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        System.out.println(get(new int[]{4,5,6,7,0,1,2}));
    }

    public static int get(int[] nums) {
        // 这是没救了
        Arrays.sort(nums);
        return nums[0];
    }
}
