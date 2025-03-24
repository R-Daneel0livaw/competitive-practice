package org.hine.easy.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArrayRankTransform {

    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }
        var rank = 1;
        for (var num : map.keySet()) {
            for (var index : map.get(num)) {
                arr[index] = rank;
            }
            rank++;
        }
        return arr;
    }
}
