package org.hine.easy.linkedList;

import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListFrequencyTest {

    @Test
    void testLinkedListFrequency() {
        var head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(2, new ListNode(3))))));
        var actual = new LinkedListFrequency().linkedListFrequency(head);

        assertEquals(1, actual.val);
        assertEquals(2, actual.next.val);
        assertEquals(3, actual.next.next.val);
    }
}
