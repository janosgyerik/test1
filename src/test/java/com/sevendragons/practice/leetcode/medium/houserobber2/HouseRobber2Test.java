package com.sevendragons.practice.leetcode.medium.houserobber2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobber2Test {

    private final Solution solution = new Solution();

    private int solve(int... nums) {
        return solution.rob(nums);
    }

    @Test
    public void test_no_house_0() {
        assertEquals(0, solve());
    }

    @Test
    public void test_one_house_first() {
        assertEquals(3, solve(3));
        assertEquals(4, solve(4));
        assertEquals(5, solve(5));
    }

    @Test
    public void test_two_houses_max() {
        assertEquals(3, solve(1, 3));
        assertEquals(4, solve(3, 4));
        assertEquals(5, solve(5, 3));
    }
}
