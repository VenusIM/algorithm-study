package Algorithms.백준.단계별로풀어보기.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2447번 별찍기 - 10
public class Step3 {
    static boolean[][] star;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        star = new boolean[N][N];
        star[0][0] = true;

        makePattern(N/3);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(star[i][j]) stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

    static void makePattern(int count) {
        if(count == 0) return;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < count; k++) {
                    if(i == 1 && j == 1) continue;
                    if(star[i][j]) star[i][j*(k+1)-1] = star[i*(k+1)-1][j] = true;
                }
            }
        }
        count--;
        makePattern(count);
    }
}
