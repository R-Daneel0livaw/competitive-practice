package org.hine.easy;

import java.util.*;

public class HighFive {

    public int[][] highFive(int[][] items) {
        Map<Integer, Queue<Integer>> allScores = new TreeMap<>();
        List<int[]> solution = new ArrayList<>();

        for(int[] item : items) {
            var id = item[0];
            var score = item[1];
            if (!allScores.containsKey(id)) {
                allScores.put(id, new PriorityQueue<>((a, b) -> b - a));
            }
            allScores.get(id).add(score);
        }

        for(int id : allScores.keySet()) {
            var sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += allScores.get(id).poll();
            }
            solution.add(new int[] {id, sum / 5});
        }
        int[][] solutionArray = new int[solution.size()][];
        return solution.toArray(solutionArray);
    }
}