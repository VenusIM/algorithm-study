package Algorithms.백준.단계별로풀어보기.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10870 피보나치 수 5
public class Step2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int numA = 0;
        int numB = 1;
        int result = 0;

        if(num == 1) {
            System.out.print(1);
            return;
        }

        for(int i = 1; i < num; i++) {
            result = numA + numB;
            numA = numB;
            numB = result;
        }
        System.out.print(result);
    }
}
