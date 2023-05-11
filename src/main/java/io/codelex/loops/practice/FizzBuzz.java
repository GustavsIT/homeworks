package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = in.nextInt();
        int lineCounter = 0;
        if (n < 0 || n > 100) {
            System.out.println("Max value is 100 and min value is 1, please enter number 1-100!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(" FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz");
            } else {
                System.out.print(" " + i);
            }
            lineCounter++;

            if (lineCounter == 20) {
                System.out.println();
                lineCounter = 0;
            }

        }
    }
}
