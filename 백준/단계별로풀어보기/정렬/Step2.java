package Algorithms.백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 2751 수 정렬하기2
public class Step2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(nums);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < nums.length; i++) {
            stringBuilder.append(nums[i]);
            if(i != count - 1) {
                stringBuilder.append("\n");
            }
        }

        System.out.print(stringBuilder);

    }
}
