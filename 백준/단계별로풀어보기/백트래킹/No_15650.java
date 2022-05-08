package Algorithms.백준.단계별로풀어보기.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_15650 {
    static int N;
    static int M;
    static int nums[];
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        nums = new int[M];
        dfs(1,0);
        System.out.print(stringBuilder);
    }

    static void dfs(int min,int depth) {
        if(depth == M) {
            for(int num : nums) stringBuilder.append(num).append(" ");
            stringBuilder.append("\n");
            return;
        }

        for(int i = min; i <= N; i++) {
            nums[depth] = i;
            dfs(i+1,depth+1);
        }
    }
}
