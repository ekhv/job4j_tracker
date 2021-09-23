package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String world : origin) {
            check.add(world);
        }
        for (String world : text) {
            if (!check.contains(world)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}