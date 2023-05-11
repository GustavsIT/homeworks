package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        System.out.println("What is your desired sum (2-12)?");
        Scanner in = new Scanner(System.in);
        int desiredSum = in.nextInt();
        System.out.println("Desired sum: " + desiredSum);

        Random random = new Random();
        int totalSum = 0;

        do {
            int randomNumber1 = random.nextInt(6) + 1;
            int randomNumber2 = random.nextInt(6) + 1;
            totalSum = randomNumber1 + randomNumber2;
            System.out.println(randomNumber1 + " and " + randomNumber2 + " = " + totalSum);
        } while (totalSum != desiredSum);
    }


}


