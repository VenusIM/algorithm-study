package 백준.단계별로풀어보기.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[][] arr = new int[N+1][N+1];
        int temp;
        int before = 0;
        for(int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            for(int j = 1; j <= N; j++) {
                arr[i][j] = before + arr[i - 1][j]; // 이전 x좌표의 값을 더해줌
                temp = Integer.parseInt(stringTokenizer.nextToken());
                arr[i][j] += temp; // 누적합
                before += temp;
            }
            before = 0;
        }

        int x1, x2, y1, y2;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            x1 = Integer.parseInt(stringTokenizer.nextToken());
            y1 = Integer.parseInt(stringTokenizer.nextToken());
            x2 = Integer.parseInt(stringTokenizer.nextToken());
            y2 = Integer.parseInt(stringTokenizer.nextToken());
            if(x1 == 1 && y1 == 1) {
                if(x2 == 1 && y2 == 1) {
                    stringBuilder.append(arr[x1][y1]).append("\n");
                    continue;
                }
                stringBuilder.append(arr[x2][y2]).append("\n");
                continue;
            }
            stringBuilder.append(arr[x2][y2] - (arr[x1-1][y2] + arr[x2][y1-1] - arr[x1-1][y1-1])).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
