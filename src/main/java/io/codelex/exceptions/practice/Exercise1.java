package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator (or 'q' to quit):");
            String numeratorInput = scanner.nextLine();

            if (numeratorInput.toLowerCase().startsWith("q")) {
                break;
            }

            try {
                int numerator = Integer.parseInt(numeratorInput);
                System.out.println("Enter the divisor:");
                String divisorInput = scanner.nextLine();
                if (divisorInput.equalsIgnoreCase("q")) {
                    break;
                }

                int divisor = Integer.parseInt(divisorInput);
                if (divisor == 0) {
                    System.out.println("You can't divide " + numerator + " by 0");
                } else {
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data. Please try again.");
            }
        }
    }

}
