package com.sevendragons.practice.airport;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Airport_martin {

    public static void writeOutput(List<Integer> output) {
        output.forEach(System.out::println);
    }

    public static List<Integer> toOutputList(Map<Integer, Integer> allocations){
        Map<Integer, Integer> sortedAlloc = new TreeMap<>();
        for (Map.Entry<Integer, Integer> allocation : allocations.entrySet()) {
            sortedAlloc.put(allocation.getValue(), allocation.getKey());
        }
        return new ArrayList<>(sortedAlloc.values());
    }
}
