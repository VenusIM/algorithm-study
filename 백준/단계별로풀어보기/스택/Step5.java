package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

// 1874번 스택 수열
public class Step5 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] nums = new int[n];

        int last = 1;
        for(int i = 0; i < n; i++) {

            nums[i] = Integer.parseInt(bufferedReader.readLine());;
            if(last != 1 && nums[i-1] < nums[i] && nums[i] < last) {
                System.out.print("NO");
                return;
            }
            else if(last < nums[i]) {
                last = nums[i];
            }

        }


        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder stringBuilder = new StringBuilder();
        int j = 1;
        for(int i = 0; i < nums.length; i++) {
            while(j <= nums[i]) {
                stack.push(j);
                stringBuilder.append("+").append("\n");
                j++;
                if(j == nums.length - 1) break;
            }
            int tmp;
            if((tmp = stack.peek()) == nums[i]) {
                stack.pop();
                stringBuilder.append("-");
                if(i != nums.length - 1) stringBuilder.append("\n");
            }

        }
        System.out.print(stringBuilder);
    }
}
