package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1712 문제 손익분기점
public class No_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] prices = bufferedReader.readLine().split(" ");

        int a = Integer.parseInt(prices[0]);
        int b = Integer.parseInt(prices[1]);
        int c = Integer.parseInt(prices[2]);

        if(c-b == 0) {
            System.out.print(-1);
            return;
        }

        int result = a/(c-b) + 1;

        if(result > 0) {
            System.out.print(result);
        }else {
            System.out.print(-1);
        }

        // n*c > a+n*b
        // n(c-b) > a
        // n > a/(c-b)
        // ==> a/(c-b) + 1

    }
}
