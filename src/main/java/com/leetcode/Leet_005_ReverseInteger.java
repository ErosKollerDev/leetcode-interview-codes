package com.leetcode;

public class Leet_005_ReverseInteger {

    public static void main(String[] args) {
        Leet_005_ReverseInteger leet = new Leet_005_ReverseInteger();
//        int intOne = 1534236469;
//        int intOne = -121;
        int intOne = 1534236469;
        System.out.println(intOne);
        System.out.println(leet.reverseInteger(intOne));
    }

    public  int reverseInteger(int x) {
        int MAX_VALUE = Integer.MAX_VALUE;
        int MIN_VALUE = Integer.MIN_VALUE;
        if(x > MAX_VALUE || x < MIN_VALUE || x == 0) return 0;

        boolean isNegative = false;
        if (x < 0) isNegative = true;
//        if(isNegative) x = -x;
        long reverse = 0;
        while(x != 0){
            //getting the last digit
            int lastDigit = x % 10;
            //removing the last digit
            x = x/10;
            //adding the last digit after multiplying by 10
            reverse = (reverse * 10) + lastDigit ;
            //checking if the reverse is greater than Integer.MAX_VALUE
            if(reverse > MAX_VALUE ) return 0;
            if(reverse< MIN_VALUE) return 0;
        }

        return (int)  reverse;
//        return   isNegative ? (int) -reverse : (int)  reverse;
    }
    //TC: 0(log5 n) SC: 0(1)
}
