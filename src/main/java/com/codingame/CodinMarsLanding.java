package com.codingame;

import java.util.Scanner;

public class CodinMarsLanding {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int surfaceN = in.nextInt(); // the number of points used to draw the surface of Mars.
        for (int i = 0; i < surfaceN; i++) {
            int landX = in.nextInt(); // X coordinate of a surface point. (0 to 6999)
            int landY = in.nextInt(); // Y coordinate of a surface point. By linking all the points together in a sequential fashion, you form the surface of Mars.
        }

        // game loop
        while (true) {
            int X = in.nextInt();
            int Y = in.nextInt();
            int hSpeed = in.nextInt(); // the horizontal speed (in m/s), can be negative.
            int vSpeed = in.nextInt(); // the vertical speed (in m/s), can be negative.
            int fuel = in.nextInt(); // the quantity of remaining fuel in liters.
            int rotate = in.nextInt(); // the rotation angle in degrees (-90 to 90).
            int power = in.nextInt(); // the thrust power (0 to 4).

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.err.println("X: " + X + ", Y: " + Y + ", hSpeed: " + hSpeed + ", ySpeed: " + vSpeed + ", fuel: " + fuel + ", rotate: " + rotate + ", power: " + power);
            // 2 integers: rotate power. rotate is the desired rotation angle (should be 0 for level 1), power is the desired thrust power (0 to 4).
            if (vSpeed < -37) {
                System.err.println("Power On");
                power = 4;
            } else {
                System.err.println("Power Off");
                if (Y > 800) {
                    power = 0;
                } else if (Y > 600) {
                    power = 1;
                } else {
                    power = 2;
                }

            }
            System.out.println("0 " + power);
        }
    }
}
