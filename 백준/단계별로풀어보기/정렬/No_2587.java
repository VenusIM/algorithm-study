package 백준.단계별로풀어보기.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[5];
        int temp;
        int value = 0;
        for(int i = 0; i < 5; i++) {
            temp = Integer.parseInt(bufferedReader.readLine());
            value += temp;
            nums[i] = temp;
        }
        bufferedReader.close();

        Arrays.sort(nums);
        System.out.print(value/5+"\n"+nums[2]);
    }
}
