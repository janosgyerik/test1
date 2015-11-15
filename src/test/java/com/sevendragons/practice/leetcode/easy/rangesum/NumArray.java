package com.sevendragons.practice.leetcode.easy.rangesum;

public class NumArray {

    private int[] numsSum;
    private int[] nums;

    public NumArray(int[] nums) {
        numsSum = new int[nums.length];
        this.nums = nums;
        initiateSum(nums);
    }
    
    private void initiateSum(int[] nums){
        int value = 0;
        for (int i=0; i< nums.length; i++){
            numsSum[i] = nums[i]+value;
            value = numsSum[i];
        }
    }

    public int sumRange(int i, int j) {
        if (j < 0) {
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        return numsSum[j]-numsSum[i]+nums[i];
    }
    
}