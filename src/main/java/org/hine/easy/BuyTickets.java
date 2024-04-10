package org.hine.easy;

import java.util.LinkedList;
import java.util.Queue;

public class BuyTickets {

    public int buyTickets(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        var count = 0;

        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            count++;
            var front = queue.poll();
            if(tickets[front] >= 1) {
                tickets[front] = tickets[front] - 1;
            }

            if (k == front && tickets[front] == 0) {
                break;
            }

            if(k != front && tickets[front] == 0) {
                continue;
            }

            queue.add(front);
        }
        return count;
    }
}