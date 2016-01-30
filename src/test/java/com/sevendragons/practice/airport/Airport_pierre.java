package com.sevendragons.practice.airport;

public class Airport_pierre {


    public int[][] toSymmetric(int[][] matrix){
        int matrixLength = matrix.length;
        int [][] matrixSymmetric = new int[matrixLength][matrixLength];

        for(int i = 0; i<matrixLength;i++){
            for(int j= 0 ; j< matrixLength;j++){
                if(j!=i){
                    matrixSymmetric[i][j]= matrix[i][j]+matrix[j][i];

                }else{
                    matrixSymmetric[i][j]= matrix[i][j];
                }

            }

        }

        return matrixSymmetric;

    }
}
