package com.sevendragons.practice.leetcode.easy.houserobber;

import java.util.*;

public class Solution {
    
    public int rob(int[] nums) {
        return rob(nums, new HashMap<Integer, Integer>());
    }

    // map: # of remaining houses -> max sum
    public int rob(int[] nums, Map<Integer, Integer> results) {
        if (nums.length == 0) {
            return 0;
        }
        if (results.containsKey(nums.length)) {
            return results.get(nums.length);
        }
        int a = nums[0] + rob(tail(nums, 2), results);  // robbing nums[0]
        int b = rob(tail(nums, 1), results);            // not robbing nums[0]
        
        int result = Math.max(a, b);
        results.put(nums.length, result);
        return result;
    }
    
    public int[] tail(int[] nums, int skip) {
        if (nums.length <= skip) {
            return new int[0];
        }
        int[] tail = new int[nums.length - skip];
        System.arraycopy(nums, skip, tail, 0, tail.length);
        return tail;
    }
}