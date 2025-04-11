package org.hine.easy.hashTable;

import java.util.*;

public class XSum {

    public int[] findXSum(int[] nums, int k, int x) {
        var n = nums.length;
        var answer = new int[n - k + 1];
        for (int i = 0; i < answer.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
                if (Objects.equals(map.get(a), map.get(b))) return b - a;
                return map.get(b) - map.get(a);
            });
            pq.addAll(Arrays.asList(map.keySet().toArray(new Integer[0])));
            var count  = x;
            while (count -- > 0 && !pq.isEmpty()) {
                var top = pq.remove();
                answer[i] += (top * map.get(top));
            }
        }
        return answer;
    }
}
