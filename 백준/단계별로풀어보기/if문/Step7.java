package Algorithms.백준.단계별로풀어보기.if문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//20466 문제 주사위 세개
public class Step7 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String numbers = bufferedReader.readLine();
        String[] nums = numbers.split(" ");

        int first = Integer.parseInt(nums[0]);
        int second = Integer.parseInt(nums[1]);
        int third = Integer.parseInt(nums[2]);

        int result = 0;

        if(first == second && second == third)
            result = 10000 + first*1000;

        else if(first != second && second != third) {
            result = Math.max(first, second);
            result = Math.max(result, third);
            result *= 100;
        }

        else {
            if(first == second) {
                result = first;
            }else if(second == third) {
                result = second;
            }else {
                result = third;
            }
            result  = result * 100 + 1000;
        }

        System.out.print(result);
    }
}
