package com.sevendragons.practice.leetcode.easy.houserobber;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {
    
    private final Solution solution = new Solution();
    
    @Test
    public void test_removeIndexAndNeighbors_size3() {
        assertArrayEquals(new int[0], solution.removeIndexAndNeighbors(new int[]{3, 1, 4}, 2));
    }

    @Test
    public void test_removeIndexAndNeighbors_size4() {
        assertArrayEquals(new int[]{2}, solution.removeIndexAndNeighbors(new int[]{3, 1, 4, 2}, 1));
    }

    @Test
    public void test_removeIndexAndNeighbors_1_4_3_6_7_2_x_3_gives_1_4_2() {
        assertArrayEquals(new int[]{1, 4, 2}, solution.removeIndexAndNeighbors(new int[]{1, 4, 3, 6, 7, 2}, 3));
    }

    @Test
    public void test_removeIndexAndNeighbors_1_4_3_6_x_0_gives_3_6() {
        assertArrayEquals(new int[]{3, 6}, solution.removeIndexAndNeighbors(new int[]{1, 4, 3, 6}, 0));
    }

    @Test
    public void test_removeIndexAndNeighbors_1_4_3_6_x_3_gives_1_4() {
        assertArrayEquals(new int[]{1, 4}, solution.removeIndexAndNeighbors(new int[]{1, 4, 3, 6}, 3));
    }
}