package Algorithms.백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//3036 링
public class Step6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] radius = new int[N];
        for(int i = 0; i < N; i++) radius[i] = Integer.parseInt(stringTokenizer.nextToken());

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i < N; i++) {
            int value = gcd(radius[0], radius[i]);
            stringBuilder
                    .append(radius[0]/value).append("/")
                    .append(radius[i]/value).append("\n");
        }
        System.out.print(stringBuilder);
    }
    //유클리드 호제
    static int gcd(int A, int B) {
        if(A % B == 0) return B;
        return gcd(B, A % B);
    }
}
