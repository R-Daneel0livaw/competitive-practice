package org.hine.easy.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxSubsequence {

    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < nums.length; i++) {
            heap.add(new int[] {nums[i], i});
        }

        PriorityQueue<int[]> ordered = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        for (int i = 0; i < k; i++) {
            ordered.add(heap.poll());
        }

        var res = new int[k];
        var i = 0;
        while (!ordered.isEmpty()) {
            res[i++] = ordered.poll()[0];
        }
        return res;
    }
}
