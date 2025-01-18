package org.hine.easy;

public class TransposeMatrix {

    public int[][] transposeMatrix(int[][] matrix) {
        var r = matrix.length;
        var c = matrix[0].length;
        var ans = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
