package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HappyNumberTest {

    @Test
    void testHappyNumber() {
        int num1 = 19;
        int num2 = 2;

        boolean expected1 = true;
        boolean expected2 = false;

        boolean actual1 = new HappyNumber().happyNumber(num1);
        boolean actual2 = new HappyNumber().happyNumber(num2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}