package org.hine.easy.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DeleteGreatestValue {

    public int deleteGreatestValue(int[][] grid) {
        List<PriorityQueue<Integer>> list = new ArrayList<>();
        var m = grid.length;
        var n = grid[0].length;

        for (int[] row : grid) {
            PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
            for (int j = 0; j < grid[0].length; j++) {
                heap.add(row[j]);
            }
            list.add(heap);
        }

        var res = 0;
        for (int i = 0; i < n; i++) {
            var num = 1;
            for (int j = 0; j < m; j++) {
                var heap = list.get(j);
                num = Math.max(num, heap.remove());
            }
            res += num;
        }
        return res;
    }
}
