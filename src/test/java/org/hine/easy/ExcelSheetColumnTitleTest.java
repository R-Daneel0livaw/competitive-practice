package org.hine.easy;

import org.hine.easy.math.ExcelSheetColumnTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnTitleTest {

    @Test
    void testExcelSheetColumnTitle() {
        var columnNumber = 28;
        var expected = "AB";
        var actual = new ExcelSheetColumnTitle().excelSheetColumnTitle(columnNumber);

        assertEquals(expected, actual);
    }
}
