package io.codelex.streams.examples;

import java.util.List;

import static java.util.Arrays.asList;

public class Quiz1 {
    public static void main(String[] args) {
        List<Person> persons = asList(
                new Person("John"),
                new Person("Bob")
        );

        // Which one is an iteration using Stream API
        persons.forEach(System.out::println);
    }
}
