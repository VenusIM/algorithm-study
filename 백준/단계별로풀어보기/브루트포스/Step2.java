package Algorithms.백준.단계별로풀어보기.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2231 분배합
public class Step2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int result = 0;
        int total = 0;
        for(int i = N-1; 0 < i; i--) {
            int value = i + total(i, total);
            if(N == value) result = i;
        }
        System.out.print(result);
    }
    static int total(int num, int total) {
        if(num <= 0) return total;
        total += num%10;
        num /= 10;
        return total(num, total);
    }
}
