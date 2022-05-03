package Algorithms.백준.단계별로풀어보기.함수;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1065 문제 한수
public class No_1065 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int length = str.length();
        int check = 1;

        int max = Integer.parseInt(str);

        int count = 99;

        if(max < 100) {
            System.out.println(max);
            return;
        }else {
            for(int i = 100; i <= max; i++) {

                if(arithmeticSequence(length, i)) {
                    count ++;
                }
            }
        }
        if(length == 4) {
            System.out.println(count-1);
        }else{
            System.out.println(count);
        }
    }

    private static boolean arithmeticSequence(int length, int num) {

        int[] nums = new int[length+1];

        for(int i = 1; i <= length; i++) {
            nums[i] = num % 10;
            num /= 10;
        }

        if(nums[3] - nums[2] != nums[2] - nums[1]) {
            return false;
        }

        return true;
    }
}
