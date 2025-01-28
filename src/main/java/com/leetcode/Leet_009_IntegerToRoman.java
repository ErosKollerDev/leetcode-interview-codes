package com.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Leet_009_IntegerToRoman {

    public static void main(String[] args) {
        Leet_009_IntegerToRoman leet = new Leet_009_IntegerToRoman();

        System.out.println(leet.intToRoman(10)); //X
        System.out.println(leet.intToRoman(2000)); //MM
        System.out.println(leet.intToRoman(1994)); //MCMXCIV
        System.out.println(leet.intToRoman(35137)); //MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCXXXVII
        System.out.println(leet.intToRoman(2000)); //MM


    }



    public String intToRoman(int numToConvert) {
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romansInts = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < romansInts.length && numToConvert > 0; i++) {
            int intRomanValue = romansInts[i];
            while (numToConvert >= intRomanValue) {
                //subtract Romans value from number to convert
                numToConvert -= intRomanValue;
                //append roman literal
                sb.append(romanLiterals[i]);
            }
        }
        return sb.toString();
    }

}
