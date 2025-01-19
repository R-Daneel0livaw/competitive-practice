package org.hine.easy;

public class LargestLocalValuesMatrix {

    public int[][] largestLocal(int[][] grid) {
        var n = grid.length;
        var maxLocal = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxLocal[i][j] = findMax(grid, i, j);
            }
        }
        return maxLocal;
    }

    private int findMax(int[][] grid, int x, int y) {
        var maxElement = 0;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                maxElement = Math.max(maxElement, grid[i][j]);
            }
        }
        return maxElement;
    }
}
