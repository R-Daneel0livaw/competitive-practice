package org.hine.easy.queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
    private final int k;
    private final Queue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();

        Arrays.stream(nums).forEach(heap::offer);
        shrinkHeap(heap);
    }

    public int add(int val) {
        heap.offer(val);
        shrinkHeap(heap);
        return heap.peek() != null ? heap.peek() : 0;
    }

    private void shrinkHeap(Queue<Integer> heap) {
        while (heap.size() > k) {
            heap.poll();
        }
    }
}