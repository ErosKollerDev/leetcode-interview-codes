package com.leetcode;

import java.util.Random;

public class Leet_069_QuickSortAlgorithmV2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = r.nextInt(100);
//        }
        System.out.println("Before");
        printArray(nums);
        quickSort(nums);
        System.out.println("After");
        printArray(nums);
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    //TODO quick sort, practice
    static void quickSort(int[] arr, int lowIndex, int highIndex) {
        //lowIndex is less than highIndex or equals to, just return, nothing to do.
        if (lowIndex >= highIndex) return;
        //choosing the last item as the pivot
        int pivot = arr[highIndex ];
        //Creating a pointer besed on lowIndex
        int leftPointer = lowIndex;
        //Creating a pointer based on highIndex
        int righPointer = highIndex;
        //Loop until the pointers meet
        while (leftPointer < righPointer) {
            //Loop forward the leftPointer
            while (arr[leftPointer] <= pivot && leftPointer < righPointer) {
                leftPointer++;
            }
            //Loop backwards the rightPointer
            while (arr[righPointer] >= pivot && leftPointer < righPointer) {
                righPointer--;
            }
            //Two pointer meet or one of the pointer encounter a constraint
            swap(arr, leftPointer, righPointer);

            //Swap leftPointer to highIndex
        }
        swap(arr, leftPointer, highIndex);
        //Separating array into left and right side
        //Left side start at lowIndex until leftPointer -1
        quickSort(arr, lowIndex, leftPointer-1);
        // Right side starts at leftPointr + 1 until highIndex
        quickSort(arr, leftPointer+1, highIndex);

    }

    private static void swap(int[] arr, int indexL, int indexR) {
        int tmp = arr[indexL];
        arr[indexL] = arr[indexR];
        arr[indexR] = tmp;
    }

    private static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

}