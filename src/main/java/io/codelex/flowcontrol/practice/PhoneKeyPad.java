package io.codelex.flowcontrol.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string! ");
        String input = in.next().toLowerCase();

        letterGenerator(input);

    }

    private static void letterGenerator(String input) {
        for (int i = 0; i < input.length(); i++) {
            char letterDigit = input.charAt(i);
            int digit = 0;

            switch (letterDigit) {
                case 'a', 'b', 'c' -> digit = 2;
                case 'd', 'e', 'f' -> digit = 3;
                case 'g', 'h', 'i' -> digit = 4;
                case 'j', 'k', 'l' -> digit = 5;
                case 'm', 'n', 'o' -> digit = 6;
                case 'p', 'q', 'r', 's' -> digit = 7;
                case 't', 'u', 'v' -> digit = 8;
                case 'w', 'x', 'y', 'z' -> digit = 9;
            }

            System.out.print(digit);
        }
    }
}
