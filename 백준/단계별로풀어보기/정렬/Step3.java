package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10989번 수 정렬하기 3 계수 정렬
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] nums = new int[10000];
        for (int i = 0; i < count; i++) {
            System.out.println(bufferedReader.readLine());
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < 10000; i++) {
            for(int j = 0; j < nums[i]; j++) {
                stringBuilder.append(i + 1).append("\n");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);

        System.out.print(stringBuilder);

    }
}
