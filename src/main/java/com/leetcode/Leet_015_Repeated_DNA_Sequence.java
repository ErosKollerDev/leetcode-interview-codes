package com.leetcode;

import java.util.*;

public class Leet_015_Repeated_DNA_Sequence {

    public static void main(String[] args) {
        Leet_015_Repeated_DNA_Sequence leet = new Leet_015_Repeated_DNA_Sequence();
        System.out.println(leet.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));

    }


    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> setDNA = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subDNA = s.substring(i, i + 10);
            if (set.contains(subDNA)) {
                setDNA.add(subDNA);
            } else {
                set.add(subDNA);
            }
        }
        return setDNA.stream().toList();
    }

}//TC : O(strs.length * str.length())
//SC : O(1)