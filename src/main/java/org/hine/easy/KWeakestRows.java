package org.hine.easy;

import java.util.PriorityQueue;
import java.util.Queue;

public class KWeakestRows {

    public int binarySearch(int[] row) {
        int low = 0;
        int high = row.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;

        Queue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            else return b[0] - a[0];
        });

        for (int i = 0; i < m; i++) {
            int strength = binarySearch(mat[i]);
            int[] entry = new int[] {strength, i};
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] indexes = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            int[] pair = pq.poll();
            if(pair != null) {
                indexes[i] = pair[1];
            }
        }
        return indexes;
    }
}