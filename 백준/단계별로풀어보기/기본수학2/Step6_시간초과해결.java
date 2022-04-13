package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9020 골드바흐의 추측
public class Step6_시간초과해결 {
    static boolean[] prime_nums = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());

        getPrimeNums();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < T; i++) {

            int num = Integer.parseInt(bufferedReader.readLine());
            int first = num/2;
            int second = num/2;

            while(true) {
                if(!prime_nums[first] && !prime_nums[second]) {
                    stringBuilder.append(first).append(" ").append(second);
                    break;
                }
                first--;
                second++;
            }
            if(i < T-1) stringBuilder.append("\n");
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
