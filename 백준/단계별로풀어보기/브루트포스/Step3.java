package Algorithms.백준.단계별로풀어보기.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//7568 덩치
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[][] info = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            info[i][0] = Integer.parseInt(stringTokenizer.nextToken());
            info[i][1] = Integer.parseInt(stringTokenizer.nextToken());
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if(info[j][0] > info[i][0] && info[j][1] > info[i][1]) rank++;
            }
            stringBuilder.append(rank).append(" ");
        }

        System.out.print(stringBuilder);
    }
}
