package 백준.단계별로풀어보기.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int[] scores = new int[n];

        for(int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(scores);

        bufferedWriter.write(String.valueOf(scores[n-k]));
        bufferedWriter.close();
        bufferedReader.close();
    }
}
