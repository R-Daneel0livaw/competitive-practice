package org.hine.easy;

import org.hine.easy.string.FizzBuzz;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void testFizzBuzz() {
        var n = 5;

        var expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        var actual = new FizzBuzz().fizzBuzz(n);

        assertEquals(expected, actual);
    }
}
