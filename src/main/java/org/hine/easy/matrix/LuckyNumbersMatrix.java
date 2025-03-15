package org.hine.easy.matrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersMatrix {

    public List<Integer> luckyNumbersMatrix(int[][] matrix) {
        var n = matrix.length;
        var m = matrix[0].length;
        List<Integer> lucky = new ArrayList<>();

        for (int[] value : matrix) {
            var num = Integer.MAX_VALUE;
            var index = -1;
            for (int j = 0; j < m; j++) {
                if (value[j] < num) {
                    num = value[j];
                    index = j;
                }
            }
            var flag = true;
            for (int[] ints : matrix) {
                if (ints[index] > num) {
                    flag = false;
                    break;
                }
            }
            if (flag) lucky.add(num);
        }
        return lucky;
    }
}
