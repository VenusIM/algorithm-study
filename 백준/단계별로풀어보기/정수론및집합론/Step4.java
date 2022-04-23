package Algorithms.백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1934 최소공배수
public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            int gcd = gcd(A,B);
            stringBuilder.append(A*B/gcd).append("\n");
        }
        System.out.print(stringBuilder);
    }

    //유클리드 호제법
    static int gcd(int A, int B) {
        if(A % B == 0) return B;
        return gcd(B, A % B);
    }
}
