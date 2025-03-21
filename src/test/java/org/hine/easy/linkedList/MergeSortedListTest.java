package org.hine.easy.linkedList;

import org.hine.easy.linkedList.MergeSortedList;
import org.hine.easy.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortedListTest {

    @Test
    void testMergeSortedList() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2, new ListNode(3));

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3, new ListNode(4));

        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(3, new ListNode(4))))));

        ListNode actual = new MergeSortedList().mergeSortedList(list1, list2);

        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
        assertEquals(expected.next.next.next.val, actual.next.next.next.val);
        assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
        assertEquals(expected.next.next.next.next.next.val, actual.next.next.next.next.next.val);
    }
}