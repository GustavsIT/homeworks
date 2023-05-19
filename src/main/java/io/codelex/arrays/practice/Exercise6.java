package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println("array1 contains: " + Arrays.toString(numbers));

        int[] newNumbers = Arrays.copyOf(numbers, 10);
        newNumbers[newNumbers.length - 1] = -7;
        System.out.println("array 2 contains: " + Arrays.toString(newNumbers));

    }
}
