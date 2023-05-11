package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the min value?");
        int minValue = in.nextInt();
        System.out.println("What is the max value?");
        int maxValue = in.nextInt();

        int range = maxValue - minValue + 1;

        for (int row = 0; row < range; row++) {
            for (int col = 0; col < range; col++) {
                int num = minValue + (row + col) % range;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
