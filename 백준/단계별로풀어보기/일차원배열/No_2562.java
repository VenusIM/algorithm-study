package Algorithms.백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2562 문제 최댓값
public class No_2562 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[9];

        for(int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int max = 0;
        int count = 0;
        int index = 0;

        for(int num : nums) {
            count ++;
            if(max < num) {
                max = num;
                index = count;
            }
        }

        System.out.println(max);
        System.out.print(index);
    }
}
