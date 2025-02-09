package com.leetcode;

import com.util.PrintHelper;

public class Leet_072_RangeSumQuery2DImmutable {
    public static void main(String[] args) {
        //[[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]]
        int[][] matrix = new int[][]
                {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        PrintHelper.printMatrix(matrix);
        Leet_072_RangeSumQuery2DImmutable leet = new Leet_072_RangeSumQuery2DImmutable(matrix);
        System.out.println(leet.sumRegion(2, 1, 4, 3));//8
    }

    //Dynamic Programming
    int[][] dp;

    public Leet_072_RangeSumQuery2DImmutable(int[][] matrix) {
        //Row size matrix.length+ 1
        //Column size matrix[0].length + 1
        dp = new int[matrix.length + 1][matrix[0].length + 1];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {

                int aboveValue = dp[r][c + 1];
                int leftValue = dp[r + 1][c];
                int aboveAndLeftValueToSub = dp[r][c];
                int matrixValue = matrix[r][c];
                dp[r + 1][c + 1] = aboveValue + leftValue - aboveAndLeftValueToSub + matrixValue;
            }
        }
        PrintHelper.printMatrix(dp);
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
    }//TC 

}