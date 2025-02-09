package com.leetcode;

import com.util.PrintHelper;

public class Leet_074_RotateImage {
    public static void main(String[] args) {
        Leet_074_RotateImage leet = new Leet_074_RotateImage();
        int[][] matrix = new int[]     []{{1,2,3},{4,5,6},{7,8,9}};
        PrintHelper.printMatrix(matrix);
        leet.rotate(matrix);
        PrintHelper.printMatrix(matrix);

    }

    public void rotate(int[][] matrix) {
        int left = 0,
                right = matrix[0].length - 1;
        while (left < right) {
            for (int i = 0; i < (right - 1); i++) {
                int top = left, bottom = right;
                //Save the top left into a var
                int tmpTopLeft = matrix[top][left + i];
                //Move the bottom left to top left
                matrix[top][left + i] = matrix[bottom - i][left];
                //Move bottom right into bottom left
                matrix[bottom - i][left] = matrix[bottom][right - i];
                //Move top right into bottom right
                matrix[bottom][right - i] = matrix[top + i][right];
                //Move top left into Top Right
                matrix[top + i][right] = tmpTopLeft;
            }
            right--;
            left++;
        }
    }

}