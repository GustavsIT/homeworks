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
                case 'a', 'b', 'c':
                    digit = 2;
                    break;
                case 'd', 'e', 'f':
                    digit = 3;
                    break;
                case 'g', 'h', 'i':
                    digit = 4;
                    break;
                case 'j', 'k', 'l':
                    digit = 5;
                    break;
                case 'm', 'n', 'o':
                    digit = 6;
                    break;
                case 'p', 'q', 'r', 's':
                    digit = 7;
                    break;
                case 't', 'u', 'v':
                    digit = 8;
                    break;
                case 'w', 'x', 'y', 'z':
                    digit = 9;
                    break;
            }

            System.out.print(digit);
        }
    }
}
