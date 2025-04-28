package org.hine.easy.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LargestNumber {

    public int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Comparator.reverseOrder());

        var str = String.valueOf(num);
        for (var c : str.toCharArray()) {
            var digit = c - '0';
            if (digit % 2 == 0) even.add(digit);
            else odd.add(digit);
        }

        var res = new StringBuilder();
        for (var c : str.toCharArray()) {
            var digit = c - '0';
            if (digit % 2 == 0) res.append(even.poll());
            else res.append(odd.poll());
        }
        return Integer.parseInt(res.toString());
    }
}
