package org.hine.easy;

import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListMiddleTest {

    @Test
    void testLinkedListMiddle() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6))))));
        int expected = 4;

        assertEquals(expected, new LinkedListMiddle().linkedListMiddle(head).val);
    }
}