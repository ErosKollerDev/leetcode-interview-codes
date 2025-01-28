package com.leetcode;

public class Leet_004_Factorial_Trailing_Zeroes {

    public static void main(String[] args) {
//        int three = Leet_004_Factorial_Trailing_Zeroes.trailingZeroes(3);
//        System.out.println("Factorial of 3 is "+three);
        System.out.println("-------------------");
//        int five = Leet_004_Factorial_Trailing_Zeroes.trailingZeroes(5);
//        System.out.println("Factorial of 5 is "+five);
//        System.out.println("-------------------");
//        int ten = Leet_004_Factorial_Trailing_Zeroes.trailingZeroes(10);
//        System.out.println("Factorial of 10 is "+ten);
        System.out.println("-------------------");
//        int n20 = Leet_004_Factorial_Trailing_Zeroes.trailingZeroes(20);
//        System.out.println("Factorial of 20 is " + n20);
        System.out.println("-------------------");
//        int n25 = Leet_004_Factorial_Trailing_Zeroes.trailingZeroes(25);
//        System.out.println("Factorial of 25 is " + n25);
//        System.out.println("-------------------");

        int n125 = Leet_004_Factorial_Trailing_Zeroes.trailingZeroes(125);
        System.out.println("Factorial of 125 is " + n125);
        System.out.println("-------------------");
    }

    public static int trailingZeroes(int n) {

        if (n == 0) return 0;
        if (n < 5) return 0;
        int zeros = 0;
        int currentPowerOf5 = 5;
        while (n >= currentPowerOf5) {
            zeros  += n / currentPowerOf5;
            currentPowerOf5 *=5;
        }
        return zeros;
    }
    //TC: 0(log5 n) SC: 0(1)
}
