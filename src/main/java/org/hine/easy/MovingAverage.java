package org.hine.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverage {
    int size = 0; int windowSum = 0; int count = 0;
    Deque<Integer> queue = new ArrayDeque<>();

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        this.count++;
        this.queue.add(val);
        var first = this.count > this.size ? this.queue.removeFirst() : 0;
        this.windowSum = this.windowSum - first + val;
        return (this.windowSum * 1.0) / Math.min(this.size, this.count);
    }
}