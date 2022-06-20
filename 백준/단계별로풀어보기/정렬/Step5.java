package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1427번 소트인사이드
public class Step5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char[] nums = bufferedReader.readLine().toCharArray();


        Arrays.sort(nums);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            stringBuilder.append(nums[i]);
        }

        System.out.print(stringBuilder);
    }
}
