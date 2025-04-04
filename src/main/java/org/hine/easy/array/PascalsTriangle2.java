package org.hine.easy.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    public List<Integer> pascalsTriangle2(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1) {
            {
                add(1);
            }
        };

        for (int i = 0; i < rowIndex; i++) {
            for (int j = i; j > 0 ; j--) {
                row.set(j, row.get(j - 1) + row.get(j));
            }
            row.add(1);
        }
        return row;
    }
}