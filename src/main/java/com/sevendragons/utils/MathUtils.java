package com.sevendragons.utils;

/**
 * Various math utils.
 *
 * See also:
 * https://codility.com/programmers/lessons/10/
 * https://codility.com/media/train/10-Gcd.pdf
 */
public final class MathUtils {

    private MathUtils() {
        throw new AssertionError("utility class, forbidden constructor");
    }

    public static int gcd(int a, int b) {
        return b < a ? gcdHelper(a, b) : gcdHelper(b, a);
    }

    private static int gcdHelper(int bigger, int smaller) {
        if (smaller == 0) {
            return bigger;
        }
        return gcd(smaller, bigger % smaller);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

