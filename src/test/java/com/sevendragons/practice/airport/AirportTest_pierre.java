package com.sevendragons.practice.airport;

import org.junit.Assert;
import org.junit.Test;

public class AirportTest_pierre {
    private Airport_pierre airport =  new Airport_pierre();


    @Test
    public void testSymetric_example() throws Exception {
        int[][] transitMatrix = {{0,100,6},{60,0,8},{4,2,0}};
        int[][] transitMatrixExpected = {{0,160,10},{160,0,10},{10,10,0}};

        Assert.assertArrayEquals(transitMatrixExpected,airport.toSymetric(transitMatrix));


    }

    @Test
    public void testSymetric_example_alreadySymetric() throws Exception {
        int[][] transitMatrix = {{1,0,0},{0,1,0},{0,0,1}};

        Assert.assertArrayEquals(transitMatrix,airport.toSymetric(transitMatrix));


    }

}
