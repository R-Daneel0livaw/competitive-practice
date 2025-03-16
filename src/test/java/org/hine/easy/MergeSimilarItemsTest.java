package org.hine.easy;

import org.hine.easy.set.MergeSimilarItems;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSimilarItemsTest {

    @Test
    void testMergeSimilarItems() {
        int[][] items1 = {{1, 3}, {2, 5}, {3, 7}};
        int[][] items2 = {{2, 4}, {3, 1}, {4, 6}};

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 9),
                Arrays.asList(3, 8),
                Arrays.asList(4, 6)
        );

        var actual = new MergeSimilarItems().mergeSimilarItems(items1, items2);

        assertEquals(expected, actual);
    }

}
