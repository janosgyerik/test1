package com.sevendragons.practice.airport;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static com.sevendragons.practice.airport.Airport.DistanceEdge;
import static com.sevendragons.practice.airport.Airport.TransitEdge;
import static com.sevendragons.practice.airport.Airport.sortByDistanceAscending;
import static com.sevendragons.practice.airport.Airport.sortByPassengersDescending;
import static com.sevendragons.practice.airport.Airport.toOutputList;
import static org.junit.Assert.assertEquals;

public class AirportTest {
    @Test
    public void test_sorted_transit_by_passengers_descending() {
        TransitEdge transitEdge1 = new TransitEdge(1, 2, 1);
        TransitEdge transitEdge2 = new TransitEdge(3, 4, 2);
        TransitEdge transitEdge5 = new TransitEdge(5, 6, 5);

        List<TransitEdge> transitEdges = Arrays.asList(transitEdge2, transitEdge1, transitEdge5);
        sortByPassengersDescending(transitEdges);

        assertEquals(Arrays.asList(transitEdge5, transitEdge2, transitEdge1), transitEdges);
    }

    @Test
    public void test_sorted_by_distance_ascending() {
        DistanceEdge distanceEdge1 = new DistanceEdge(1, 2, 1);
        DistanceEdge distanceEdge2 = new DistanceEdge(3, 4, 2);
        DistanceEdge distanceEdge5 = new DistanceEdge(5, 6, 5);

        List<Airport.DistanceEdge> distanceEdges = Arrays.asList(distanceEdge2, distanceEdge1, distanceEdge5);
        sortByDistanceAscending(distanceEdges);

        assertEquals(Arrays.asList(distanceEdge1, distanceEdge2, distanceEdge5), distanceEdges);
    }

    @Test
    public void test_toOutputList() {
        List<Integer> output = Arrays.asList(3,1,2,4);

        Map<Integer, Integer> allocations = new HashMap<>();
        allocations.put(1,2);
        allocations.put(4,4);
        allocations.put(3,1);
        allocations.put(2,3);

        assertEquals(toOutputList(allocations), output);
    }

}
