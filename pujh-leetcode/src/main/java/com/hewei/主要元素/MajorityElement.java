package com.hewei.主要元素;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3, 4, 4, 4, 4, 4};
        // int[] nums = {3};
        if (nums.length == 1) {
            System.out.println(nums[0]);
        }
        int threshold = nums.length / 2 + 1;
        int value;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                value = map.get(num);
                if (value + 1 == threshold) {
                    System.out.println(num);
                    return;
                }
                map.put(num, value + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(-1);
    }
}
