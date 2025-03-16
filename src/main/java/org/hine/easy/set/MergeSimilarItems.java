package org.hine.easy.set;

import java.util.*;
import java.util.stream.Collectors;

public class MergeSimilarItems {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> cnt = new TreeMap<>();
        Arrays.stream(items1).forEach(it -> cnt.merge(it[0], it[1], Integer::sum));
        Arrays.stream(items2).forEach(it -> cnt.merge(it[0], it[1], Integer::sum));

        return cnt.entrySet().stream().map(e -> Arrays.asList(e.getKey(), e.getValue())).collect(Collectors.toList());
    }
}
