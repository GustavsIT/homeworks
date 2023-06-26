package io.codelex.testCodelex.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesterForTestExercise3 {

    @Test
    public void testJoiner1() {
        Joiner<Integer> joiner = new Joiner<>("-");
        Integer[] numbers = {1, 2, 3, 4, 5};
        String result = joiner.join(numbers);
        Assertions.assertEquals("1-2-3-4-5", result);
    }

    @Test
    public void testJoiner2() {
        Joiner<String> joiner2 = new Joiner<>("-");
        String[] names = {"John", "Bob", "Doe", "Po", "ChinChang"};
        String result2 = joiner2.join(names);
        Assertions.assertEquals("John-Bob-Doe-Po-ChinChang", result2);
    }
}
