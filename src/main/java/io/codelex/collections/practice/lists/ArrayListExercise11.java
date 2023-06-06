package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        ArrayList<String> series = new ArrayList<>();

        //TODO: Add 10 values to list
        series.add("The Office");
        series.add("Rhythm and flow");
        series.add("Narcos");
        series.add("Breaking bad");
        series.add("Foobar");
        series.add("One of us is lying");
        series.add("Rick and Morty");
        series.add("Friends");
        series.add("Top Gear");


        //TODO: Add new value at 5th position
        series.add(4, "Lauku sēta");
        System.out.println(series);

        //TODO: Change value at last position (Calculate last position programmatically)
        series.remove(series.size() - 1);
        System.out.println(series);

        //TODO: Sort your list in alphabetical order
        Collections.sort(series);
        System.out.println(series);

        //TODO: Check if your list contains "Foobar" element
        if (series.contains("Foobar")) {
            System.out.println("List DOES contains Foobar!");
        } else {
            System.out.println("List does NOT contain Foobar!");
        }

        //TODO: Print each element of list using loop
        for (String s : series) {
            System.out.println(s);
        }

    }

}
