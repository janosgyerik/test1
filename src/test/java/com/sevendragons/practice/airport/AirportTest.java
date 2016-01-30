package com.sevendragons.practice.airport;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.sevendragons.practice.airport.Airport.*;
import static org.junit.Assert.assertEquals;

public class AirportTest {
    @Test
    public void test_toTransitEdges() {
        int[][] matrix = {
                {0, 100, 6},
                {60, 0, 8},
                {4, 2, 0}
        };
        List<TransitEdge> expected = Arrays.asList(
                new TransitEdge(0, 1, 100),
                new TransitEdge(0, 2, 6),
                new TransitEdge(1, 0, 60),
                new TransitEdge(1, 2, 8),
                new TransitEdge(2, 0, 4),
                new TransitEdge(2, 1, 2)
        );
        assertEquals(expected, toTransitEdges(matrix));
    }

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

}
