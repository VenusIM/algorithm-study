package Algorithms.백준.단계별로풀어보기.동적계획법1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class No_1932 {
    static int[][] arr;
    static Integer[][] dept;
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(bufferedReader.readLine());

        arr = new int[N][N];
        dept = new Integer[N][N];
        StringTokenizer stringTokenizer;
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            dept[N - 1][i] = arr[N - 1][i];
        }

        System.out.println(find(0, 0));

    }

    static int find(int depth, int idx) {
        if(depth == N - 1) return dept[depth][idx];

        if (dept[depth][idx] == null) {
            dept[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
        }
        return dept[depth][idx];

    }
}
