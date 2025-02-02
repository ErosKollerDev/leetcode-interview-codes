package com.leetcode.practicing02;

/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * Example 2:
 * <p>
 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * Example 3:
 * <p>
 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -100.0 < x < 100.0
 * -231 <= n <= 231-1
 * n is an integer.
 * Either x is not zero or n > 0.
 * -104 <= xn <= 104
 */
public class Leet_006_Power_X_N_eros {

    public static void main(String[] args) {
        Leet_006_Power_X_N_eros leet = new Leet_006_Power_X_N_eros();
        System.out.println(leet.myPow(2, 10));//1024
//        System.out.println(leet.myPow(4, 5));//1024
//        System.out.println(leet.myPow(2.10000, 3));//9.26100
//        System.out.println(leet.myPow(2.00000, -2));// 0.25000
//        System.out.println(leet.myPow(0.44528, 0));// 1.0
//        System.out.println(leet.myPow(1.0, 2147483647));// 1.0
    }

    public double myPow(double value, int power) {
        //Initial result value
        double result = 1.0;
        //Transform to a positive number
        int powerAbs = Math.abs(power);
        //Test is powerAbs is diferent then Zero
        while (powerAbs != 0) {
            //Every odd number (last one, always), we should calculate the result and decrease by one interaction the power
            if (powerAbs % 2 == 1) {
                result = result * value;
                powerAbs--;
            }
            //Calculate the square  n * n
            value = value * value;
            //Dividing the power by 2, to shorten the calculation
            powerAbs = powerAbs / 2;
        }


        return power < 0 ? 1.0 / result : result;
    }
}
