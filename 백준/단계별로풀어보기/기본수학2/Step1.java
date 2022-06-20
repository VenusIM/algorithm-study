package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1978번 소수 찾기
public class Step1 {
    public static void main(String[] args) throws IOException {

        boolean[] prime_number = new boolean[10001];
        Arrays.fill(prime_number,true);
        prime_number[0] = prime_number[1] = false;

        int num = 2;
        while(true) {
            if(num == 10001) {
                break;
            }
            if(prime_number[num] == false) {
                num++;
                continue;
            }
            for(int i = num+1; i < 10001; i++) {
                if(i%num == 0) prime_number[i] = false;
            }
            num++;
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++) {
            if(prime_number[Integer.parseInt(stringTokenizer.nextToken())]) count++;
        }

        System.out.print(count);
    }
}
