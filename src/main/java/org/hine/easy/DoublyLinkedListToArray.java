package org.hine.easy;

import org.hine.easy.util.DoublyListNode;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedListToArray {

    public int[] doublyLinkedListToArray(DoublyListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
