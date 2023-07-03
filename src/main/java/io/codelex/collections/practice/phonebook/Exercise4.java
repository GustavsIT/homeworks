package io.codelex.collections.practice.phonebook;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        String input = in.nextLine();
        Set<String> uniqueNames = new HashSet<>();
        while (!input.isEmpty()) {
            uniqueNames.add(input);
            input = in.nextLine();
        }
        System.out.println("Unique name list contains: " + uniqueNames);
    }
}
