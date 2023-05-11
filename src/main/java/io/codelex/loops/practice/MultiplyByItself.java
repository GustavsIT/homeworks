package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i;
        int n;

        System.out.print("Input number for i : ");
        Scanner in = new Scanner(System.in);
        i = in.nextInt();
        System.out.print("Input number for n : ");
        n = in.nextInt();

        int result = 1;
        for (int j = 0; j < n; j++) {
            result *= i;
        }
        System.out.println("you multiplied " + i + " " + n + " times and result is " + result);

    }

}
