package org.hine.easy;

import java.util.*;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        Queue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(stones).forEach(heap::add);

        while (heap.size() > 1) {
            var stone1 = heap.poll();
            var stone2 = heap.poll();
            if(stone1 != null && stone2 != null && !Objects.equals(stone1, stone2)) {
                heap.add(stone1 - stone2);
            }
        }
        return heap.isEmpty() ? 0 : heap.size();
    }
}