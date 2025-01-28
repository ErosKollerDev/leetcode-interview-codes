package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet_014_Repeated_DNA_Sequence {

    public static void main(String[] args) {
        Leet_014_Repeated_DNA_Sequence leet = new Leet_014_Repeated_DNA_Sequence();
        System.out.println(leet.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));

    }


    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>(s.length()/2);
        for (int i = 0; i < s.length() - 10; i++) {
            String subsDNA = s.substring(i, i + 10);
            map.put(subsDNA, map.getOrDefault(subsDNA, 0) + 1);
        }
        List<String> listDNA = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                listDNA.add(entry.getKey());
            }
        }

        return listDNA;
    }

}//TC : O(strs.length * str.length())
//SC : O(1)