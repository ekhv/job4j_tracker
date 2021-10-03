package ru.job4j.tracker;

import java.util.Comparator;

public class SortByNameItemDescending implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return -1 * o1.getName().compareTo(o2.getName());
    }
}
