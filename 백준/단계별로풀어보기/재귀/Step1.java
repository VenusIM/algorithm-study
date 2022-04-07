package Algorithms.백준.단계별로풀어보기.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10872 팩토리얼
public class Step1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int result = 1;
        while(0 < num) {
            result *= num;
            num--;
        }
        System.out.print(result);
    }
}
