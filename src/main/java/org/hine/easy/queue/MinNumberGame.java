package org.hine.easy.queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinNumberGame {

    public int[] minNumberGame(int[] nums) {
        var ans = new int[nums.length];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Arrays.stream(nums).forEach(heap::add);

        var i = 0;
        while (!heap.isEmpty()) {
            var front = heap.remove();
            ans[i++] = heap.remove();
            ans[i++] = front;
        }
        return ans;
    }
}
