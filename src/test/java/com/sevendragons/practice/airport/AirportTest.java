package com.sevendragons.practice.airport;

import org.junit.Assert;
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
    public void test_toDistanceEdges() {
        int[][] matrix = {
                {0, 10, 12},
                {10, 0, 5},
                {12, 5, 0}
        };
        List<DistanceEdge> expected = Arrays.asList(
                new DistanceEdge(0, 1, 10),
                new DistanceEdge(0, 2, 12),
                new DistanceEdge(1, 0, 10),
                new DistanceEdge(1, 2, 5),
                new DistanceEdge(2, 0, 12),
                new DistanceEdge(2, 1, 5)
        );
        assertEquals(expected, toDistanceEdges(matrix));
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

    @Test
    public void test_toSymmetric_example() throws Exception {
        int[][] transitMatrix = {{0,100,6},{60,0,8},{4,2,0}};
        int[][] transitMatrixExpected = {{0,160,10},{160,0,10},{10,10,0}};

        Assert.assertArrayEquals(transitMatrixExpected,toSymmetric(transitMatrix));


    }

    @Test
    public void test_toSymmetric_alreadySymmetric() throws Exception {
        int[][] transitMatrix = {{1,0,0},{0,1,0},{0,0,1}};

        Assert.assertArrayEquals(transitMatrix,toSymmetric(transitMatrix));


    }

}
