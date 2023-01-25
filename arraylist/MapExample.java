package com.arraylist;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("USA", "Washington D.C.");
        map.put("UK", "London");
        map.put("Australia", "Canberra");

        List<String> upperCaseList = map.entrySet()
                .stream()
                .map(entry -> entry.getKey().toUpperCase() + ": " + entry.getValue().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCaseList);
    }
}
