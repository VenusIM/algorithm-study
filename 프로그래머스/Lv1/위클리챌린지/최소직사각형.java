package Algorithms.프로그래머스.Lv1.위클리챌린지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class 최소직사각형 {
    public static void main(String[] args) {

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution1(sizes));

    }

    static int solution1(int[][] sizes){

        int firstMax = 0;
        int secondMax = 0;
        int tmp;

        for(int i = 0; i < sizes.length; i++) {

            if(sizes[i][0] < sizes[i][1]) {
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }

            if(firstMax < sizes[i][0])
                firstMax = sizes[i][0];

            if(secondMax < sizes[i][1])
                secondMax = sizes[i][1];

        }
        return firstMax*secondMax;
    }
}
