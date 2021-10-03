package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class SortByIdItemTest {
    @Test
    public void whenItemAscending() {
        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        items.sort(new SortByNameItemAscending());
        assertEquals("A", items.get(0).getName());
        assertEquals("B", items.get(1).getName());
        assertEquals("C", items.get(2).getName());
    }

    @Test
    public void whenItemDescending() {
        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        items.sort(new SortByNameItemDescending());
        assertEquals("C", items.get(0).getName());
        assertEquals("B", items.get(1).getName());
        assertEquals("A", items.get(2).getName());
    }
}