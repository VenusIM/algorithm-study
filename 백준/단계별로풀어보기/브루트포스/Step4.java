package Algorithms.백준.단계별로풀어보기.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1018번 체스판 다시 칠하기
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        boolean[][] board = new boolean[N][M];
        for(int i = 0; i < N; i++) {
            String str = bufferedReader.readLine();
            for(int j = 0; j < M; j++) {
                char val = str.charAt(j);
                board[i][j] = val == 'W' ? true : false;
            }
        }

        int result = 64;

        for(int i = 0; i <= N-8; i++) {
            for(int j = 0; j <= M-8; j++) {
                int count = 0;
                boolean start = board[i][j];
                for(int k = i; k < i+8; k++) {
                    for(int l = j; l < j+8; l++) {
                        if(start != board[k][l]) count++;
                        start = !start;
                    }
                    start = !start;
                }

                count = Math.min(64-count , count);
                if(count < result) result = count;

            }
        }
        System.out.print(result);
    }
}
