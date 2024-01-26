package org.hine.easy;

import org.hine.easy.util.ListNode;

public class MergeSortedList {

    public ListNode mergeSortedList(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeSortedList(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeSortedList(list1, list2.next);
            return list2;
        }
    }
}
