package com.roadmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an
 * anagram
 * of s, and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * <p>
 * Output: false
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 * <p>
 * <p>
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
public class Leet_002_ValidAnagram {

    public static void main(String[] args) {
        Leet_002_ValidAnagram leet = new Leet_002_ValidAnagram();

        System.out.println(leet.isAnagram("eros", "sore"));
        System.out.println(leet.isAnagram("eros", "sory"));
    }


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;
        HashMap<String, Integer> mapS = new HashMap<>();
        HashMap<String, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String ss = s.charAt(i) + "";
            String tt = t.charAt(i) + "";
            if (mapS.containsKey(ss)) {
                mapS.put(ss, mapS.getOrDefault(ss, 0) + 1);
            } else {
                mapS.put(ss, 1);
            }
            if (mapT.containsKey(tt)) {
                mapT.put(tt, mapT.getOrDefault(tt, 0) + 1);
            } else {
                mapT.put(tt, 1);
            }
        }
        for (String s_ : mapS.keySet()) {
            if (!mapS.get(s_).equals(mapT.get(s_))) {
                return false;
            }
        }
        return true;
    }

}//TC : O(strs.length * str.length())
//SC : O(1)