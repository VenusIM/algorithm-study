package 백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[30];
        int compareNum;
        for(int i = 0;  i < 28; i++) {
           compareNum = Integer.parseInt(bufferedReader.readLine());
           nums[compareNum-1] = 1;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;  i < 30; i++) {
            if(nums[i] == 0) {
                stringBuilder.append(i+1).append("\n");
            }
        }

        System.out.print(stringBuilder);
    }
}
