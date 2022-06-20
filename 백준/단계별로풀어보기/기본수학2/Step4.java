package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//1929번 소수 구하기
public class Step4 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        boolean[] prime_nums = new boolean[N + 1];

        for(int i = 2; i <= N; i++) {
            if(prime_nums[i]) continue;

            if(i >= M) stringBuilder.append(i).append("\n");

            for(int j = i + i; j <= N; j += i) {
                prime_nums[j] = true;
            }
        }

        System.out.println(stringBuilder);
    }

}
