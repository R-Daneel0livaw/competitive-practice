package org.hine.easy.linkedList;

import org.hine.easy.linkedList.IntersectionLinkedList;
import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntersectionLinkedListTest {

    @Test
    void testIntersectionLinkedList() {
        ListNode intersection = new ListNode(5);
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, intersection)));
        ListNode head2 = new ListNode(4, intersection);

        assertEquals(intersection.val, new IntersectionLinkedList().intersectionLinkedList(head1, head2).val);
    }
}