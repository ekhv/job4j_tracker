package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("e.khryashchev@outlook.com", "Khryashchev Evgeniy Olegovich");
        map.put("parsentev@yandex.ru", "Arsentev Petr Sergeevich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
