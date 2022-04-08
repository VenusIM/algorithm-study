package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 11653번 소인수분해
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        boolean[] prime_number = new boolean[N+1];
        Arrays.fill(prime_number, true);

        prime_number[0] = prime_number[1] = false;

        int num = 2;

        while(num <= N) {
            if (prime_number[num] == false) {
                num++;
                continue;
            }
            for (int i = num + 1; i <= N; i++) {
                if (i % num == 0) prime_number[i] = false;
            }
            num++;
        }


        StringBuilder stringBuilder = new StringBuilder();
        int prime_num = 2;
        while(N != 1) {
            if( N < prime_num) break;
            if(prime_number[prime_num] && N%prime_num == 0) {
                N /= prime_num;
                stringBuilder.append(prime_num);
                if(N != 1) stringBuilder.append("\n");
            }
            else prime_num++;
        }
        System.out.print(stringBuilder);
    }
}
