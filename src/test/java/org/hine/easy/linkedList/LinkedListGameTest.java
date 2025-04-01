package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListGameTest {

    @Test
    void testLinkedListGame() {
        var head = new ListNode(2, new ListNode(5, new ListNode(4, new ListNode(7, new ListNode(20, new ListNode(5))))));
        var expected = "Odd";
        var actual = new LinkedListGame().linkedListGame(head);

        assertEquals(expected, actual);
    }
}
