package org.hine.easy.queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TakeGiftsRichestPile {

    public long takeGiftsRichestPile(int[] gifts, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(gifts).forEach(heap::add);
        for (int i = 0; i < k; i++) {
            var max = heap.remove();
            heap.add((int) Math.sqrt(max));
        }

        long remaining = 0;
        while (!heap.isEmpty()) {
            remaining += heap.remove();
        }
        return remaining;
    }
}
