package com.codingame;

import java.util.Scanner;

public class CodinThereIsNoSpoonv2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        System.err.println("width: " + width + ", height: " + height);
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[][] grid = new String[height][width];
        for (int y = 0; y < height; y++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            grid[y] = line.split("");
            System.err.println(line);
            System.err.println("------");
        }
        int x1 = 0;
        int y1 = 0;
        int x2 = -1;
        int y2 = -1;
        int x3 = -1;
        int y3 = -1;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                if (!grid[y][x].equals("0")) {
                    x++;
                }
                if (x < width && grid[y][x].equals("0")) {
                    x1 = x;
                    y1 = y;
                    if (x + 1 < width) {
                        for (int xx = x + 1; xx < width; xx++) {
                            if (grid[y][xx].equals("0")) {
                                x2 = xx;
                                y2 = y;
                                break;
                            } else {
                                x2 = -1;
                                y2 = -1;
                            }
                        }
                    } else {
                        x2 = -1;
                        y2 = -1;
                    }

                    if (y + 1 < height) {
                        for (int yy = y + 1; yy < height; yy++) {
                            if (grid[yy][x].equals("0")) {
                                x3 = x;
                                y3 = yy;
                                break;
                            } else {
                                x3 = -1;
                                y3 = -1;
                            }
                        }
                    } else {
                        x3 = -1;
                        y3 = -1;
                    }
                    System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
                }
            }
        }
    }
}
