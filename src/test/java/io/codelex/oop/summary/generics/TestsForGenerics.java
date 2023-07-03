package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.hamcrest.Matchers;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.Optional;

@SuppressWarnings("SimplifiableJUnitAssertion")

public class TestsForGenerics {
    @Test
    public void combinerTest() {
        String result = Combiner.combineTwoItems(12345, "Heya hopsa");
        assertEquals("First item: 12345; Second item: Heya hopsa", result);

    }

    @Test
    public void printerTest() {
        Printer<Integer> printer = new Printer<>(100);
        assertEquals(100, printer.getThingToPrint());
    }

    @Test
    public void storageHouseTest() {
        StorageHouse<String> storageHouse = new StorageHouse<>("First item");
        Optional<String> maybeFirstItem = storageHouse.getMaybeFirstItem();
        assertTrue(maybeFirstItem.isPresent());
        assertEquals("First item", maybeFirstItem.get());
        storageHouse.addMoreItems("Second item");
        storageHouse.addMoreItems("Third item");
        List<String> expectedItems = asList("First item", "Second item", "Third item");
        assertThat(storageHouse.items, containsInAnyOrder(expectedItems.toArray()));
    }

}