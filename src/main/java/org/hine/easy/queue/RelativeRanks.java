package org.hine.easy.queue;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class RelativeRanks {

    public String[] relativeRanks(int[] score) {
        var n = score.length;
        var res = new String[n];

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        IntStream.range(0, n).forEach(s -> heap.add(new int[] {score[s], s}));

        var place = 1;
        while (!heap.isEmpty()) {
            var top = heap.remove();
            var index = top[1];

            switch (place) {
                case 1: res[index] = "Gold Medal"; break;
                case 2: res[index] = "Silver Medal"; break;
                case 3: res[index] = "Bronze Medal"; break;
                default: res[index] = String.valueOf(place);
            }
            place++;
        }
        return res;
    }
}
