package Algorithms.백준.단계별로풀어보기.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1436 영화감독 슘
public class Step5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int num = 666;
        int count = 1;

        while(count < N) {
            num++;
            if(String.valueOf(num).contains("666")) count++;
        }
        System.out.print(num);
    }
}
