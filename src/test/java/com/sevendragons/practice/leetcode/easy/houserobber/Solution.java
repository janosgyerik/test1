package com.sevendragons.practice.leetcode.easy.houserobber;

public class Solution {
    
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int a = nums[0] + rob(tail(nums, 2));  // robbing nums[0]
        int b = rob(tail(nums, 1));            // not robbing nums[0]
        return Math.max(a, b);
    }
    
    public int[] tail(int[] nums, int skip) {
        if (nums.length <= skip) {
            return new int[0];
        }
        int[] tail = new int[nums.length - skip];
        System.arraycopy(nums, skip, tail, 0, tail.length);
        return tail;
    }

    //remove index and adjacent ind
    // 1, [3, 1, 4] -> []
    // 3, [1, 4, 3, 6, 7] -> [1,4]
    //              ^
    // 3, [1, 4, 3, 6, 7, 2] -> [1,4,2]
    //              ^
    public int[] removeIndexAndNeighbors(int[] nums, int index) {
        if (nums.length <= 3) {
            return new int[0];
        }
        
        int[] toReturn;
        if (index == 0) {
            toReturn = new int[nums.length - 2];
            // [1, 4, 2, 3], 0 -> [2, 3]
            System.arraycopy(nums, 2, toReturn, 0, toReturn.length);
        } else if (index == nums.length - 1) {
            // [1, 4, 2, 3], 3 -> [1, 4]
            toReturn = new int[nums.length - 2];
            System.arraycopy(nums, 0, toReturn, 0, toReturn.length);
        } else {
            toReturn = new int[nums.length - 3];
            System.arraycopy(nums, 0, toReturn, 0, index - 1);
            System.arraycopy(nums, index + 2, toReturn, index - 1, nums.length - index - 2);
        }
        return toReturn;
    }
    
    
}