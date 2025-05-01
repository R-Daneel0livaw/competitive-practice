package org.hine.easy.queue;

public class MinTImeFillCups {

    public int fillCups(int[] cups) {
        var max = 0; var sum = 0;
        for (var c : cups) {
            max = Math.max(max, c);
            sum += c;
        }
        return Math.max(max, (sum + 1) / 2);
    }
}
