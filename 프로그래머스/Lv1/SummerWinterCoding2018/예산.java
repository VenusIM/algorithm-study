package Algorithms.프로그래머스.Lv1.SummerWinterCoding2018;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {

        int[] d = {2,2,3,3};
        int budget = 10;
        System.out.println(solution3_2(d, budget));
    }

    static int solution3_2(int[] d, int budget) {

        int answer = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {
           budget -= d[i];
           if(budget < 0) break;
            answer ++;
        }

        return answer;
    }
}
