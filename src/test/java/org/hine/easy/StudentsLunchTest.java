package org.hine.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentsLunchTest {

    @Test
    void testStudentsLunch() {
        var students = new int[] {1, 1, 1, 0, 0, 1};
        var sandwiches = new int[] {1, 0, 0, 0, 1, 1};

        var expected = 3;
        var actual = new StudentsLunch().studentsLunch(students, sandwiches);

        assertEquals(expected, actual);
    }
}