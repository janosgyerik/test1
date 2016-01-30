package com.sevendragons.practice.airport;

public class Airport_pierre {


    public int[][] toSymetric(int[][] matrix){
        int lengthmatrix = matrix.length;
        int [][] matrix_symetric = new int[lengthmatrix][lengthmatrix];

        for(int i = 0; i<lengthmatrix;i++){
            for(int j= 0 ; j< lengthmatrix;j++){
                if(j!=i){
                    matrix_symetric[i][j]= matrix[i][j]+matrix[j][i];

                }else{
                    matrix_symetric[i][j]= matrix[i][j];
                }

            }

        }

        return matrix_symetric;

    }
}
