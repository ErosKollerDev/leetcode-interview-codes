package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.
 * <p>
 * A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
 * <p>
 * 0 <= i, j < nums.length
 * i != j
 * |nums[i] - nums[j]| == k
 * Notice that |val| denotes the absolute value of val.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,1,4,1,5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4,5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * Example 3:
 * <p>
 * Input: nums = [1,3,1,5,4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -107 <= nums[i] <= 107
 * 0 <= k <= 107
 */
public class Leet_047_K_Diff_PairsIn_Array {
    public static void main(String[] args) {
        Leet_047_K_Diff_PairsIn_Array leet = new Leet_047_K_Diff_PairsIn_Array();
        System.out.println(leet.findPairs(new int[]{3, 1, 4, 1, 5}, 2)); // -> 2
        System.out.println(leet.findPairs(new int[]{1, 2, 3, 4, 5}, 1));// -> 4
        System.out.println(leet.findPairs(new int[]{1, 3, 1, 5, 4}, 0));// -> 1
        System.out.println(leet.findPairs(new int[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3}, 3));// -> 2
    }


    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(k == 0 ){
                if(entry.getValue() >= 2){
                    count++;
                }
            }else{
                if(map.containsKey(entry.getKey() + k)){
                    count++;
                }
            }
        }
        return count;
    }

}