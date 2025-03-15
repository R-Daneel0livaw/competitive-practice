package org.hine.easy;

import org.hine.easy.stack.CrawlerLogFolder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CrawlerLogFolderTest {

    @Test
    void testCrawlerLogFolder() {
        String[] ops = new String[]{"d1/","d2/","../","d21/","./"};
        var expected = 2;
        var actual = new CrawlerLogFolder().crawlerLogFolder(ops);

        assertEquals(expected, actual);
    }
}