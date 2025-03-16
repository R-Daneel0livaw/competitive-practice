package org.hine.easy;

import org.hine.easy.stack.RemoveAdjacentDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveAdjacentDuplicatesTest {

    @Test
    void testRemoveAdjacentDuplicates() {
        var s1 = "azxxzy";
        var expected1 = "ay";
        var actual1 = new RemoveAdjacentDuplicates().removeAdjacentDuplicates(s1);

        assertEquals(expected1, actual1);
    }
}