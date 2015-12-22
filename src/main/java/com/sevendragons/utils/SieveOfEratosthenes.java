package com.sevendragons.utils;

import java.util.Arrays;

/**
 * Implementation of the sieve of Eratosthenes,
 * useful for repeated checks of primes up to some limit.
 *
 * See also:
 * https://codility.com/programmers/lessons/9/
 * https://codility.com/media/train/9-Sieve.pdf
 */
public class SieveOfEratosthenes implements Sieve {

    private final boolean[] sieve;

    public SieveOfEratosthenes(int limit) {
        sieve = new boolean[Math.max(limit + 1, 2)];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i * i <= limit; ++i) {
            if (sieve[i]) {
                for (int k = i * i; k <= limit; k += i) {
                    sieve[k] = false;
                }
            }
        }
    }

    @Override
    public boolean isPrime(int num) {
        if (sieve.length <= num) {
            throw new IllegalStateException(String.format("Insufficient capacity: %s <= %s (create a bigger sieve)", sieve.length, num));
        }
        return sieve[num];
    }
}
