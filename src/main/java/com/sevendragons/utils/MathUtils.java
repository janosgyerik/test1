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

    /**
     * Compute the greatest common divisor of two numbers, using the Euclidean algorithm.
     *
     * @param a the first number
     * @param b the second number
     * @return the greatest common divisor of the two numbers
     */
    public static int gcd(int a, int b) {
        return b < a ? gcdHelper(a, b) : gcdHelper(b, a);
    }

    /**
     * Compute the greatest common divisor of multiple numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param values more numbers
     * @return the greatest common divisor of all the numbers
     */
    public static int gcd(int a, int b, int... values) {
        int gcdOfAll = gcd(a, b);
        for (int x : values) {
            gcdOfAll = gcd(gcdOfAll, x);
        }
        return gcdOfAll;
    }

    private static int gcdHelper(int bigger, int smaller) {
        if (smaller == 0) {
            return bigger;
        }
        return gcd(smaller, bigger % smaller);
    }

    /**
     * Compute the least common multiple of two numbers, using the Euclidean algorithm.
     *
     * @param a the first number
     * @param b the second number
     * @return the least common multiple of the two numbers
     */
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

