package org.hine.easy.hashTable;

import org.hine.easy.hashTable.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTest {

    @Test
    void testLogger() {
        Logger logger = new Logger();

        boolean actual1 = logger.shouldPrintMessage(1, "hello");
        boolean expected1 = true;
        assertEquals(expected1, actual1);

        boolean actual2 = logger.shouldPrintMessage(5, "hello");
        boolean expected2 = false;
        assertEquals(expected2, actual2);

        boolean actual3 = logger.shouldPrintMessage(5, "hi");
        boolean expected3 = true;
        assertEquals(expected3, actual3);

        boolean actual4 = logger.shouldPrintMessage(12,"hi");
        boolean expected4 = false;
        assertEquals(expected4, actual4);

        boolean actual5 = logger.shouldPrintMessage(12,"hello");
        boolean expected5 = true;
        assertEquals(expected5, actual5);
    }
}