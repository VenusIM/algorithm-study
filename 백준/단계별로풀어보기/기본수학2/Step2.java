package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 2581번 소수
public class Step2 {
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
        int M = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());

        int min = 0;
        int total = 0;
        for(int i = N; M <= i; i--) {
            if(prime_number[i]) {
                total += i;
                min = i;
            }
        }

        if(min == 0) System.out.print(-1);
        else System.out.print(total+"\n"+min);
    }
}
