package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9020 골드바흐의 추측
public class Step6_시간초과 {
    static boolean[] prime_nums = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        int min = 0;
        int max = 0;

        getPrimeNums();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < T; i++) {

            int num = Integer.parseInt(bufferedReader.readLine());

            for(int j = 0; j <= num/2; j++) {
                if(prime_nums[j]) continue;
                for(int k = num/2; k < num; k++) {
                    if(prime_nums[k]) continue;

                    if(j + k == num && min == 0 && max == 0 ) {
                        max = k;
                        min = j;
                    }else if(j + k == num && k - j < max - min) {
                        max = k;
                        min = j;
                    }

                }
            }
            stringBuilder.append(min).append(" ").append(max);
            if(i < T-1) stringBuilder.append("\n");
            min = 0;
            max = 0;
        }

        System.out.print(stringBuilder);
    }

    static void getPrimeNums() {
        prime_nums[0] =prime_nums[1] = true;
        for(int i = 2; i <= Math.sqrt(prime_nums.length); i++) {
            if(prime_nums[i]) continue;
            for(int j = i * i; j < prime_nums.length; j += i) {
                prime_nums[j] = true;
            }
        }
    }
}
