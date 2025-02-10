package com.patterns;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[]   nums = {1,2,3,4,5,6,7};
        System.out.println(bs.search(nums, 3));
        System.out.println(Arrays.binarySearch(nums, 3));
    }


    private int search(int[] nums, int target){
        int left = 0 , right = nums.length -1;
        while(left <= right){
            int middle = left + (right - left)/ 2;
            if(nums[middle] == target)return  middle;
            if(target < nums[middle])right = middle -1;
            else left = middle +1;
        }
        return -1;
    }
}
