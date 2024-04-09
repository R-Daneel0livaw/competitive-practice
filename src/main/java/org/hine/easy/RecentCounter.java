package org.hine.easy;

import java.util.Deque;
import java.util.LinkedList;

public class RecentCounter {
    Deque<Integer> slideWindow;

    public RecentCounter() {
        this.slideWindow = new LinkedList<>();
    }

    public int ping(int t) {
        this.slideWindow.addLast(t);
        while (slideWindow.getFirst() < t - 3000) {
            slideWindow.removeFirst();
        }
        return this.slideWindow.size();
    }
}