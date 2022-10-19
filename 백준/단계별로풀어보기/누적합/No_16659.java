package 백준.단계별로풀어보기.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_16659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] sumArr = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        sumArr[0] = Integer.parseInt(stringTokenizer.nextToken());

        //누적 합 세팅
        for(int i = 1; i < N; i++) {
           sumArr[i] = sumArr[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        int i, j;
        StringBuilder stringBuilder = new StringBuilder();
        for(int k = 0; k < M; k++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            i = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            j = Integer.parseInt(stringTokenizer.nextToken()) - 1;
            if(i == 0) {
                stringBuilder.append(sumArr[j]);
            }else {
                stringBuilder.append(sumArr[j] - sumArr[i-1]);
            }
            stringBuilder.append("\n");
        }

        System.out.print(stringBuilder);
        bufferedReader.close();
    }
}
