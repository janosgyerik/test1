package com.sevendragons.utils;

import org.junit.Test;

import static com.sevendragons.utils.PrefixSumUtils.prefixSums;
import static org.junit.Assert.assertArrayEquals;

public class PrefixSumUtilsTest {
    private int[] ints(int... ints) {
        return ints;
    }

    @Test
    public void test_empty() {
        assertArrayEquals(ints(0), prefixSums(ints()));
    }

    @Test
    public void test_arr_3() {
        assertArrayEquals(ints(0, 3), prefixSums(ints(3)));
    }

    @Test
    public void test_arr_3_1() {
        assertArrayEquals(ints(0, 3, 4), prefixSums(ints(3, 1)));
    }

    @Test
    public void test_arr_3_1_5() {
        assertArrayEquals(ints(0, 3, 4, 9), prefixSums(ints(3, 1, 5)));
    }
}
