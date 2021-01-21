package com.hewei.剑指Offer.数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatNumber {
    public static void main(String[] args) {
        System.out.println(get(new int[]{1,2,3,3,2}));
    }

    public static int get(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return n;
            }
        }
        return -1;
    }
}
