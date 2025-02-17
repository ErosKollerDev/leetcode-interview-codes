package com.roadmap;

import java.util.*;

public class Leet_004_GroupAnagram49 {
    public static void main(String[] args) {
        Leet_004_GroupAnagram49 leet = new Leet_004_GroupAnagram49();
        leet.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> group = new ArrayList<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                ArrayList<String> as = new ArrayList<>();
                as.add(str);
                map.put(key, as);
            }
        }
        group.addAll(map.values());
        return group;
    }

}