package Algorithms.백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//11050 이항 계수 1
public class Step7 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    static int factorial(int N) {

        if (N < 2)	{
            return 1;
        }
        return N * factorial(N - 1);
    }
}