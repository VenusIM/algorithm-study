package 백준.단계별로풀어보기.백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 1부터 N까지 자연수 중에서 M개를 고른 수열
 * 같은 수를 여러 번 골라도 된다.
 * 고른 수열은 비내림차순이어야 한다.
 * 길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.
 */
public class No_15652 {

    static int[] nums;
    static int N, M;
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        nums = new int[M];
        dfs(1,0);
        System.out.print(stringBuilder.toString());
    }

    static void dfs(int st, int depth) {

        if(depth == M) {
            for(int i = 0; i < M; i++) {
                stringBuilder.append(nums[i]).append(" ");
            }
            stringBuilder.append("\n");
            nums[depth-1] += 1;
            return;
        }

        for(int i = st; i <= N; i++) {
            nums[depth] = i;
            dfs(i, depth+1);
        }
    }
}
