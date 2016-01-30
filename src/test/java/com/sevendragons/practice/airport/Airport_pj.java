package com.sevendragons.practice.airport;

import java.util.Scanner;

public class Airport_pj {

    public static int readDimensions(Scanner scanner){
        return Integer.valueOf(scanner.nextLine());
    }

    public static int[][] readMatrix(Scanner scanner, int dimensions){
        int[][] matrix = new int[dimensions][dimensions];
        for (int i = 0; i < dimensions; i++){
            String[] values = scanner.nextLine().split(",");
            for (int j = 0; j < values.length; j++){
                try{
                    matrix[i][j] = Integer.valueOf(values[j]);
                } catch (NumberFormatException e) {
                    System.err.println("Error when parsing line "+i+" column "+j+": not parsable value "+values[j]);
                }

            }
        }
        return matrix;
    }
}
