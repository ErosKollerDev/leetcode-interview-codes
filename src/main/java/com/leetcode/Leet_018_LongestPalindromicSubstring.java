package com.leetcode;

public class Leet_018_LongestPalindromicSubstring {
    public static void main(String[] args) {
        Leet_018_LongestPalindromicSubstring leet = new Leet_018_LongestPalindromicSubstring();
//        System.out.println(leet.longestPalindrome("racecar"));
//        System.out.println(leet.longestPalindrome("racecard"));
//        System.out.println(leet.longestPalindrome("cagac"));
        System.out.println(leet.longestPalindrome("cbbd"));
        //c a a c

    }

    //c a a c
    public String longestPalindrome(String s) {
        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (check(start, start + length, s)) {
                    return s.substring(start, start + length);
                }
            }
        }
        return "";
    }
    //TODO master this code, need to optimize
    private boolean check(int i, int j, String s) {
        int left = i;
        int right = j - 1;
        while (left < right) {
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);
            if ( cLeft != cRight) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}//TC : O(strs.length * str.length())
//SC : O(1)