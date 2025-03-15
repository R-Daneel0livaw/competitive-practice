package org.hine.easy.matrix;

public class FindMissingAndRepeated {

    public int[] findMissingAndRepeated(int[][] grid) {
        var n = grid.length;
        long expectedSum = (long) n * n * ((long) n * n + 1) / 2;
        long expectedSquareSum = (long) n * n * ((long) n * n + 1) * (2L * n * n + 1) / 6;

        long actualSum = 0, actualSquareSum = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < n; j++) {
                actualSum += ints[j];
                actualSquareSum += (long) ints[j] * ints[j];
            }
        }

        long sumDiff = actualSum - expectedSum;
        long squareSumDiff = actualSquareSum - expectedSquareSum;

        long sumPlusDiff = squareSumDiff / sumDiff;
        var a = (int) ((sumDiff + sumPlusDiff) / 2);
        var b = (int) (sumPlusDiff - a);
        return new int[] {a, b};
    }
}
