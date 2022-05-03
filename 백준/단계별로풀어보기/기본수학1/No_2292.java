package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2292 문제 벌집
public class No_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        int count = 1;
        int result = 1;

        while(true) {
            if(num <= result) {
                break;
            }
            count ++;
            result += (count-1) * 6;
        }

        System.out.print(count);
    }
}
