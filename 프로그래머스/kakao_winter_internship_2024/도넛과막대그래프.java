package Algorithms.프로그래머스.kakao_winter_internship_2024;

import java.util.*;

public class 도넛과막대그래프 {
    public static void main(String[] args) {
        new 도넛과막대그래프().solution(new int[][]{{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}});
    }

    public int[] solution(int[][] edges) {
        Map<Integer, Integer> in = new HashMap<>();
        Map<Integer, Integer> out = new HashMap<>();
        for(int[] edge : edges) {
            out.put(edge[0], out.getOrDefault(edge[0], 0) + 1);
            in.put(edge[1], in.getOrDefault(edge[1], 0) + 1);
        }

        int [] result = new int[4];
        for(int node : out.keySet()) {
            if(out.get(node) > 1) {
                if(!in.containsKey(node)) {
                    result[0] = node;
                } else {
                    result[3] += 1;
                }
            }
        }

        for (int node : in.keySet()) {
            if (!out.containsKey(node)) {
                result[2] += 1;
            }
        }

        result[1] = out.get(result[0]) - result[2] - result[3];
        return result;
    }
}
