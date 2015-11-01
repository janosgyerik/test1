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
    
    @Test
    public void test_tail_9_x_1() {
        assertArrayEquals(new int[0], solution.tail(new int[]{9}, 1));
    }

    @Test
    public void test_tail_9_x_2() {
        assertArrayEquals(new int[0], solution.tail(new int[]{9}, 2));
    }

    @Test
    public void test_tail_8_9_x_2() {
        assertArrayEquals(new int[0], solution.tail(new int[]{8, 9}, 2));
    }

    @Test
    public void test_tail_1_2_3_x_1() {
        assertArrayEquals(new int[]{2, 3}, solution.tail(new int[]{1, 2, 3}, 1));
    }
    
    @Test
    public void test_tail_1_2_3_x_2() {
        assertArrayEquals(new int[]{3}, solution.tail(new int[]{1, 2, 3}, 2));
    }
    
    @Test
    public void test_rob_1_2_3_is_4() {
        assertEquals(4, solution.rob(new int[]{1, 2, 3}));
    }
    
    @Test
    public void test_rob_1_5_3_is_5() {
        assertEquals(5, solution.rob(new int[]{1, 5, 3}));
    }
    
    @Test
    public void test_rob_time_limit_exceeded_example() {
        assertEquals(0, solution.rob(new int[]{183,219,57,193,94,233,202,154,65,240,97,234,100,249,186,66,90,238,168,128,177,235,50,81,185,165,217,207,88,80,112,78,135,62,228,247,211}));
    }
}