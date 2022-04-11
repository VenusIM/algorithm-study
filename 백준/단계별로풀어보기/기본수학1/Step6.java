package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2775 부녀회장이 될테야
public class Step6 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());

        int[][] apart = new int[15][15];

        for(int i = 0; i < 15; i++) {
            apart[0][i] = i; // 각 호수 0층
            apart[i][1] = 1; // 층별 1호
        }

        for (int i = 1; i < 15; i++) { // 1~14층
            for (int j = 2; j < 15; j++) { // 2~14호
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(apart[k][n]);
            if(i < T - 1) stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
