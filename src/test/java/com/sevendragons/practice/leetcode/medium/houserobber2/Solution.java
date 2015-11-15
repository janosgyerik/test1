package com.sevendragons.practice.leetcode.medium.houserobber2;

import java.util.*;

public class Solution {
    
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int valueOfFirst = nums[0];
        int valueOfLast = nums[nums.length-1];
        nums[0] = 0;
        int totalWithoutFirst = robSingle(nums);
        nums[0] = valueOfFirst;
        nums[nums.length-1] = 0;
        int totalWithoutLast = robSingle(nums);
        return Math.max(totalWithoutFirst, totalWithoutLast);
    }

    public int robSingle(int[] nums) {
        return rob(nums, 0, new HashMap<Integer, Integer>());
    }

    // map: # of remaining houses -> max sum
    public int rob(int[] nums, int start, Map<Integer, Integer> results) {
        if (start >= nums.length ) {
            return 0;
        }
        if (results.containsKey(start)) {
            return results.get(start);
        }
        int a = nums[start] + rob(nums, start + 2, results);  // robbing nums[start]
        int b = rob(nums, start + 1, results);                // not robbing nums[start]
        
        int result = Math.max(a, b);
        results.put(start, result);
        return result;
    }
}