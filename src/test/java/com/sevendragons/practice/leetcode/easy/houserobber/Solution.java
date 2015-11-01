package com.sevendragons.practice.leetcode.easy.houserobber;

public class Solution {
    public int rob(int[] nums) {
        
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
        int[] toReturn = new int[nums.length - 3];
        System.arraycopy(nums, 0, toReturn, 0, );
        
    }
}