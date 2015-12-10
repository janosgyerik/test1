package com.sevendragons.utils;

import java.util.Arrays;

public class SieveOfEratosthenes implements Sieve {

    private final boolean[] sieve;

    public SieveOfEratosthenes(int max) {
        sieve = new boolean[Math.max(max + 1, 2)];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i * i <= max; ++i) {
            if (sieve[i]) {
                for (int k = i * i; k <= max; k += i) {
                    sieve[k] = false;
                }
            }
        }
    }

    @Override
    public boolean isPrime(int num) {
        return sieve[num];
    }
}
