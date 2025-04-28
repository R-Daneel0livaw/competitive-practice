package org.hine.easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TakeGiftsRichestPileTest {

    @Test
    void testTakeGiftsRichestPile() {
        var gifts = new int[] {25, 64, 9, 4, 100};
        var k = 4;
        var expected = 29;
        var actual = new TakeGiftsRichestPile().takeGiftsRichestPile(gifts, k);

        assertEquals(expected, actual);
    }
}
