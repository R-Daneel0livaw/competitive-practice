package org.hine.easy.matrix;

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        var rows = grid.length;
        var cols = grid[0].length;

        var result = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    result += 4;

                    if (i > 0 && grid[i - 1][j] == 1) {
                        result -= 2;
                    }

                    if (j > 0 && grid[i][j - 1] == 1) {
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }
}
