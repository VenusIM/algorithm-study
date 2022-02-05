package Algorithms.백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1546 제목 평균
public class Step5 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] scores = new int[count];
        String[] strs = bufferedReader.readLine().split(" ");
        for(int i = 0; i < count; i++) {
            scores[i] = Integer.parseInt(strs[i]);
        }

        Arrays.sort(scores);

        double maxScore = scores[count-1];
        double total = 0;
        for(int k = 0; k < count; k++) {
            total += scores[k]/maxScore*100;
        }

        System.out.print(total/count);
    }
}
