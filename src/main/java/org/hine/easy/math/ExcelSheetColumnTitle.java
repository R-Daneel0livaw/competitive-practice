package org.hine.easy.math;

public class ExcelSheetColumnTitle {

    public String excelSheetColumnTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            ans.append((char) (((columnNumber) % 26) + 'A'));
            columnNumber /= 26;
        }
        return ans.reverse().toString();
    }
}
