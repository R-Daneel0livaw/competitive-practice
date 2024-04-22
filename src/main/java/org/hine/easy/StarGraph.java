package org.hine.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StarGraph {

    public int starGraph(int[][] edges) {
        var ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(edges).flatMapToInt(Arrays::stream)
                .forEach(elem -> map.put(elem, map.getOrDefault(elem, 0) + 1));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) ans = entry.getKey();
        }
        return ans;
    }
}