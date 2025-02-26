package com.roadmap;

import java.util.HashMap;
import java.util.HashSet;

import static com.util.PrintHelper.printArray;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class Leet_003_TwoSum {

    public static void main(String[] args) {
        Leet_003_TwoSum leet = new Leet_003_TwoSum();
        int[] ints = null;
        ints = leet.twoSum(new int[]{2, 7, 11, 15}, 9);
        printArray(ints);
        ints = leet.twoSum(new int[]{3, 2, 4}, 6);
        printArray(ints);
        ints = leet.twoSum(new int[]{0, 4, 3, 0}, 0);
        printArray(ints);
        ints = leet.twoSum(new int[]{0, 3, -3, 4, -1}, -1);
        printArray(ints);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int diff = target - n;
            if (map.containsKey(diff)) {
                ans[1] = i;
                ans[0] = map.get(diff);
            } else {
                map.put(n, i);
            }
        }
        return ans;
    }
} //TC: 0(n) (Time Complexity | SC: 0(n) (Space Complexity) )
