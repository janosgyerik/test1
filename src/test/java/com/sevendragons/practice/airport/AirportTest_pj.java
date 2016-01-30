package com.sevendragons.practice.airport;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Scanner;

public class AirportTest_pj {

    @Test
    public void readDimensions(){
        Scanner scanner = new Scanner("3\n" +
                "0,10,12\n" +
                "10,0,5\n" +
                "12,5,0\n" +
                "0,100,6\n" +
                "60,0,8\n" +
                "4,2,0");
        assertEquals(Airport_pj.readDimensions(scanner), 3);
        assertArrayEquals(Airport_pj.readMatrix(scanner, 3),new int[][]{{0,10,12},{10,0,5},{12,5,0}});
        assertArrayEquals(Airport_pj.readMatrix(scanner, 3),new int[][]{{0,100,6},{60,0,8},{4,2,0}});
    }

}
