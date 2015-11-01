package com.sevendragons.practice.leetcode.easy.houserobber;

public class IterativeSolution {
    public int rob(int[] nums) {
        int length = nums.length;
        switch (length) {
            case 0: return 0;
            case 1: return nums[0];
        }

        int maxAtPrevPrev = nums[0];
        int maxAtPrev = Math.max(nums[0], nums[1]);

        for (int i = 2; i < length; ++i) {
            int current = nums[i];
            int max = Math.max(maxAtPrevPrev + current, maxAtPrev);
            maxAtPrevPrev = maxAtPrev;
            maxAtPrev = max;
        }
        return maxAtPrev;
    }   
}