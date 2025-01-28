package com.leetcode;

public class Leet_006_Power_X_N {

    public static void main(String[] args) {
        Leet_006_Power_X_N leet = new Leet_006_Power_X_N();
        System.out.println(leet.myPow(2, 10));//1024
        System.out.println(leet.myPow(4, 5));//1024
//        System.out.println(leet.myPow(2.10000, 3));//9.26100
//        System.out.println(leet.myPow(2.00000, -2));// 0.25000
//        System.out.println(leet.myPow(0.44528, 0));// 1.0
//        System.out.println(leet.myPow(1.0, 2147483647));// 1.0
    }

    public double myPow(double x, int n) {
        //convert in positive
        long num = Math.abs((long) n);
        //setup a minimum result
        double result = 1.0;
        while (num != 0) {
            //n is a odd number
            if (num % 2 == 1) {
                //
                result = result * x;
                num--;
            }
            x = x * x;
            num = num / 2;
        }
        return n < 0 ? 1.0 / result : result;

    }
}
