package Algorithms.백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// 3052 제목 나머지
public class No_3052 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];

        for(int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine())%42;
        }

        Arrays.sort(nums);

        int[] counts = new int[10];

        for(int j = 0; j < 10; j++) {
            for(int k = j+1; k < 10; k++) {
                if(nums[j] == nums[k]) {
                    counts[j]++;
                }
            }
        }

        int count = 0;

        for(int num : counts) {
            if(num == 0) {
                count ++;
            }
        }

        System.out.print(count);
    }
}
