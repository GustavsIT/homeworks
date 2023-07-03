package io.codelex.collections.practice.phonebook;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = in.nextInt();
        if (isHappyNumber(input)) {
            System.out.println(input + " IS HAPPY NUMBER!");
        } else {
            System.out.println(input + " is NOT a happy number!");
        }
    }

    public static boolean isHappyNumber(int number) {
        int sum = 0;
        int remainder;
        while (true) {
            while (number > 0) {
                remainder = number % 10;
                sum += remainder * remainder;
                number = number / 10;
            }
            if (sum == 1) {
                return true;
            } else if (sum == 4) {
                return false;
            } else {
                number = sum;
                sum = 0;
            }
        }
    }

}
