package io.codelex.streams.examples;

import java.util.Arrays;

public class Quiz2 {
    public static void main(String[] args) {
        Arrays.asList(34, 6, 3, 12, 65, 1, 8).stream()
                .filter(n -> n > 5)
                .sorted()
                .forEach(System.out::println);
        // Output will be:
        // 1. 6 8 12 34 65

    }
}
