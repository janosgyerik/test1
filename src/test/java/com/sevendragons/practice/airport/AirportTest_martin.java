package com.sevendragons.practice.airport;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest_martin {

    private final Airport_martin airport = new Airport_martin();

    @Test
    public void test_toOutputList() {
        List<Integer> output = Arrays.asList(3,1,2,4);

        Map<Integer, Integer> allocations = new HashMap<>();
        allocations.put(1,2);
        allocations.put(4,4);
        allocations.put(3,1);
        allocations.put(2,3);

        assertEquals(airport.toOutputList(allocations), output);
    }

    @Test
    public void test_writeOutput() {
        airport.writeOutput(Arrays.asList(3,1,2,4));
    }
}
