package org.hine.easy.matrix;

public class Construct2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) return new int[][] {};

        var result = new int[m][n];
        var index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index];
                index++;
            }
        }
        return result;
    }
}
