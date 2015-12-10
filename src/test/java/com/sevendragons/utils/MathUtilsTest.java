package com.sevendragons.utils;

import org.junit.Test;

import static com.sevendragons.utils.MathUtils.gcd;
import static com.sevendragons.utils.MathUtils.lcm;
import static org.junit.Assert.*;

public class MathUtilsTest {
    @Test
    public void test_gcd_1_5() {
        assertEquals(1, gcd(1, 5));
    }

    @Test
    public void test_gcd_2_5() {
        assertEquals(1, gcd(2, 5));
    }

    @Test
    public void test_gcd_6_15() {
        assertEquals(3, gcd(6, 15));
    }

    @Test
    public void test_gcd_9_15() {
        assertEquals(3, gcd(9, 15));
    }

    @Test
    public void test_gcd_bigger_prime_multiples() {
        assertEquals(13 * 17, gcd(2 * 13 * 17, 3 * 13 * 17));
    }

    @Test
    public void test_lcm_1_5() {
        assertEquals(5, lcm(1, 5));
    }

    @Test
    public void test_lcm_2_5() {
        assertEquals(10, lcm(2, 5));
    }

    @Test
    public void test_lcm_6_15() {
        assertEquals(30, lcm(6, 15));
    }

    @Test
    public void test_lcm_9_15() {
        assertEquals(45, lcm(9, 15));
    }

    @Test
    public void test_lcm_bigger_prime_multiples() {
        assertEquals(2 * 3 * 13 * 17, lcm(2 * 13 * 17, 3 * 13 * 17));
    }
}
