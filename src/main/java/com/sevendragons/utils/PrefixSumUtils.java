package com.sevendragons.utils;

/**
 * Prefix sums provide a simple yet powerful technique that allows for the
 * fast calculation of sums of elements in given contiguous segments of arrays.
 * Prefix sums are defined as the consecutive totals of the first 0, 1, 2, . . . , n elements of an array.
 *
 * See also:
 * https://codility.com/programmers/lessons/3/
 * https://codility.com/media/train/3-PrefixSums.pdf
 */
public final class PrefixSumUtils {

    private PrefixSumUtils() {
        throw new AssertionError("utility class, forbidden constructor");
    }

    /**
     * Create an array of prefix sums for the source array,
     * such that:
     *
     *   prefix[i] = x[0] + x[1] + ... + x[i-1]
     *
     * For example, for [3, 1, 5] return [0, 3, 4, 9]:
     *
     *   prefix[0] = 0
     *   prefix[1] = x[0] = 3
     *   prefix[2] = x[0] + x[1] = 3 + 1 = 4
     *   prefix[3] = x[0] + x[1] + x[2] = 3 + 1 + 5 = 9
     *
     * @param arr source array
     * @return prefix sums
     */
    public static int[] prefixSums(int[] arr) {
        int[] sums = new int[arr.length + 1];
        for (int i = 1; i < arr.length + 1; i++) {
            sums[i] = sums[i - 1] + arr[i - 1];
        }
        return sums;
    }
}
