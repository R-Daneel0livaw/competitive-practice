package org.hine.easy.matrix;

public class MatrixRotation {

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int rotations = 0; rotations < 4; rotations++) {
            if (areMatricesEqual(mat, target)) {
                return true;
            }
            mat = rotate90Degrees(mat);
        }

        return false;
    }

    private boolean areMatricesEqual(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[][] rotate90Degrees(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }
}
