package com.leetcode;

public class Leet_003_PalindromeNumber {

    public static void main(String[] args) {

        System.out.println("-----------------");
        System.out.println(Leet_003_PalindromeNumber.isPalindrome(121212121));
//        System.out.println("-----------------");
//        System.out.println(Leet_003_PalindromeNumber.isPalindrome(10));
//        System.out.println("-----------------");
//        System.out.println(Leet_003_PalindromeNumber.isPalindrome(-121));
//        System.out.println("-----------------");
//        System.out.println(Leet_003_PalindromeNumber.isPalindrome(0));
    }
    public static  boolean isPalindrome(int x) {

        if (x < 0 ) return false;
        if(x == 0) return true;
        if(x != 0  && x % 10 == 0) return false;

        int reverse = 0;
        while(reverse < x){
            //get last digit
            int lastDigit = x % 10;
            //add to reverse   (12 then i have to multiply by 10 before adding)
            reverse = reverse * 10 + lastDigit;
            //remove last digit
            x = x / 10;
        }
        return
                (reverse == x)||
                //(12/10 == 1)
                        (reverse / 10 == x);
//        String sN = x + "";
//
//        String sNinverted = "";
//        for (int i = 0; i < sN.length(); i++) {
//            sNinverted = sN.charAt(i) + sNinverted;
//        }
//        try {
//            Integer y = Integer.valueOf(sNinverted);
//
//            if (y.intValue() == x)
//                return true;
//        } catch (Exception e) {
//            return false;
//        }
//
//        return false;
    }

}
