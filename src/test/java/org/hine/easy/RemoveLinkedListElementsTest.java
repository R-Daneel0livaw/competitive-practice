package org.hine.easy;

import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveLinkedListElementsTest {

    @Test
    void testRemoveLinkedListElements() {
        ListNode head = new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(2))));
        int num = 2;
        ListNode expected = new ListNode(3);

        ListNode actual = new RemoveLinkedListElements().removeLinkedListElements(head, num);
        assertEquals(expected.val, actual.val);
        assertNull(expected.next);
    }
}