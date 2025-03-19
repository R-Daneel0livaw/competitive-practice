package org.hine.easy.array;

import org.hine.easy.array.PascalsTriangle2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PascalsTriangle2Test {

    @Test
    void testPascalsTriangle2() {
        int rowIndex1 = 0;
        List<Integer> expected1 = new ArrayList<>() {
            {
                add(1);
            }
        };
        assertArrayEquals(expected1.toArray(), new PascalsTriangle2().pascalsTriangle2(rowIndex1).toArray());

        int rowIndex2 = 3;
        List<Integer> expected2 = new ArrayList<>();
        expected2.add(1);
        expected2.add(3);
        expected2.add(3);
        expected2.add(1);
        assertArrayEquals(expected2.toArray(), new PascalsTriangle2().pascalsTriangle2(rowIndex2).toArray());
    }
}