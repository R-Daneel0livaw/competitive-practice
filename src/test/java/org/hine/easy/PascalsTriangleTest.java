package org.hine.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleTest {

    @Test
    void testPascalsTriangle() {
        int numRows1 = 1;
        int expectedSize1 = 1;
        assertEquals(expectedSize1, new PascalsTriangle().pascalsTriangle(numRows1).size());

        int numRows2 = 5;
        int expectedSize2 = 5;
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        expected.add(row1);
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        expected.add(row2);
        List<Integer> row3 = new ArrayList<>();
        row3.add(1);
        row3.add(2);
        row3.add(1);
        expected.add(row3);
        List<Integer> row4 = new ArrayList<>();
        row4.add(1);
        row4.add(3);
        row4.add(3);
        row4.add(1);
        expected.add(row4);
        List<Integer> row5 = new ArrayList<>();
        row5.add(1);
        row5.add(4);
        row5.add(6);
        row5.add(4);
        row5.add(1);
        expected.add(row5);
        assertEquals(expectedSize2, new PascalsTriangle().pascalsTriangle(numRows2).size());
        assertArrayEquals(expected.toArray(), new PascalsTriangle().pascalsTriangle(numRows2).toArray());
    }
}