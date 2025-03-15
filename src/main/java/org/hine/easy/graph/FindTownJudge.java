package org.hine.easy.graph;

public class FindTownJudge {

    public int findTownJudge(int n, int[][] trust) {
        if(trust.length < n - 1) return -1;

        var trustScores = new int[n + 1];

        for (int[] relation: trust) {
            trustScores[relation[0]]--;
            trustScores[relation[1]]++;
        }

        for (int i = 0; i <= n; i++) {
            if (trustScores[i] == n - 1) return i;
        }
        return -1;
    }
}