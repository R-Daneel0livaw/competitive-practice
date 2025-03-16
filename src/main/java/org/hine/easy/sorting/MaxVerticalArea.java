package org.hine.easy.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MaxVerticalArea {

    public int maxVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        var ans = 0;
        for (int i = 1; i < points.length; i++) {
            ans = Math.max(ans, points[i][0] - points[i - 1][0]);
        }
        return ans;
    }
}