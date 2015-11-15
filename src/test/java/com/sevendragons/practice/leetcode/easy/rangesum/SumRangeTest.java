package com.sevendragons.practice.leetcode.easy.rangesum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumRangeTest {
    
    @Test
    public void test_sum_0_2_gives_1() {
        NumArray solution = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, solution.sumRange(0, 2));
    }
    
    @Test
    public void test_0_5_gives_m3() {
        NumArray solution = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(-3, solution.sumRange(0, 5));
    }
    
    @Test
    public void test_sum_2_5_gives_m1() {
        NumArray solution = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(solution.sumRange(2, 5), -1);
    }
    
    @Test
    public void test_negative_range_end() {
        assertEquals(0, new NumArray(new int[]{1, 2, 3}).sumRange(-3, -2));
    }
    
    @Test
    public void test_invalid_range() {
        assertEquals(0, new NumArray(new int[]{1, 2, 3}).sumRange(2, 1));
    }
    
    @Test
    public void test_one_element_sum(){
        assertEquals(1, new NumArray(new int[]{1}).sumRange(0,0));
    }
    
    @Test
    public void test_two_element_sum(){
        assertEquals(3, new NumArray(new int[]{1,2}).sumRange(0,1));
    }
}