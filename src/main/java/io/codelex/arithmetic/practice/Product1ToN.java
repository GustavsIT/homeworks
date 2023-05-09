package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int n = 10;
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println("The product of integers from 1 to " + n + " is " + total);

    }
}
