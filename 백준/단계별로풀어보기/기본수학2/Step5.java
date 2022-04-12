package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 4948 베르트랑 공준
public class Step5 {

    static boolean[] prime_nums = new boolean[246913];

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        makePrimeNums();

        StringBuilder stringBuilder = new StringBuilder();
        while(true) {
            int n = Integer.parseInt(bufferedReader.readLine());

            if(n == 0) break;

            int count = 0;
            for(int i = n+1; i <= 2*n; i++) {
                if(!prime_nums[n]) count++;
            }
            stringBuilder.append(count).append("\n");
        }

        System.out.print(stringBuilder);
    }

    static void makePrimeNums() {
        prime_nums[0] = prime_nums[1] = true;

        for(int i = 2; i <= Math.sqrt(prime_nums.length); i++) {
            if(prime_nums[i]) continue;
            for(int j = i * i; j < prime_nums.length; j += i) {
                prime_nums[j] = true;
            }
        }
    }
}
