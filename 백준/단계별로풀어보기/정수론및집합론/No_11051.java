package 백준.단계별로풀어보기.정수론및집합론;

import java.io.*;
import java.util.*;

public class No_11051 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] dp = new int[N + 1][N + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}

/**
 * 시간초과
 */
//    static int factorial(int num, int value) {
//        if(num == 1) {
//            return value;
//        }
//        value *= num;
//        num--;
//        return factorial(num, value);
//    }

