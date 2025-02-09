package com.util;

public class PrintHelper {


    public static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
//                System.out.print(matrix[r][c] + (c >= matrix.length - 1 ? "\n" : " | "));
                System.out.print(matrix[r][c] + " | ");
            }
            System.out.println();
        }
        for (int r = 0; r < matrix.length; r++) {
            System.out.print("---");
        }
        System.out.println();
    }

}
