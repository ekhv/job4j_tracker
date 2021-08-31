package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items,size);
    }

    public Item[] findByName(String key) {
        Item[] itemsRsl = new Item[100];
        int counter = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item != null && item.getName().equals(key)) {
                itemsRsl[index] = item;
                counter++;
            }
        }
        return Arrays.copyOf(items,counter);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return index != -1;
    }
}