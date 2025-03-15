package org.hine.easy;

import org.hine.easy.queue.BuyTickets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BuyTicketsTest {

    @Test
    void testBuyTickets() {
        var tickets = new int[] {5, 1, 1, 1};
        int k = 0;

        var expected = 8;
        var actual = new BuyTickets().buyTickets(tickets, k);

        assertEquals(expected, actual);
    }
}