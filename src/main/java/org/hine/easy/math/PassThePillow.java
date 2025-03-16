package org.hine.easy.math;

public class PassThePillow {

    public int passThePillow(int n, int time) {
        var fullRounds = time / (n - 1);
        var extraTime = time % (n - 1);

        if (fullRounds % 2 == 0) return extraTime + 1;
        else return n - extraTime;
    }
}
