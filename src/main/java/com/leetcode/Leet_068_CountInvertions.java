package com.leetcode;

public class Leet_068_CountInvertions {
    public static void main(String[] args) {
        Leet_068_CountInvertions leet = new Leet_068_CountInvertions();

        System.out.println(leet.countInversions(new int[]{5, 2, 3, 1}));
    }

    public long merge(int[] nums, int left, int mid, int right) {
        int aSize = mid - left + 1;
        int bSize = right - mid;
        int[] a = new int[aSize];
        int[] b = new int[bSize];
        for (int i = 0; i < aSize; i++) {
            a[i] = nums[left + i];
        }
        for (int y = 0; y < bSize; y++) {
            b[y] = nums[mid + y + 1];
        }
        long count = 0;
        int i = 0, j = 0, k = left;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                nums[k] = a[i];
                i++;
                k++;
                count++;
            } else {
                nums[k] = b[j];
                j++;
                k++;
                count++;
//                count += mid - (left + i) + 1;
            }
        }
        if (i < a.length) nums[k++] = a[i++];

        if (j < b.length) nums[k++] = b[j++];

        return count;
    }

    public long mergeSort(int[] nums, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSort(nums, left, mid);
            count += mergeSort(nums, mid + 1, right);
            count += merge(nums, left, mid, right);
        }
        return count;
    }


    public long countInversions(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        return mergeSort(nums, left, right);
    }//TC:  O(nlog(n)) SC: O(n)

}