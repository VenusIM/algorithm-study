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
        boolean[] arr = new boolean[n];

        Stack<Integer> stack = new Stack<Integer>();
        // 배열에 수열 삽입
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for(int i = 0; i < n; i++) {
            stack.add(i+1);
            stringBuilder.append("+").append("\n");
            while(!stack.isEmpty()) {
                if(nums[index] <= stack.peek()) {
                    stringBuilder.append("-").append("\n");
                    stack.pop();
                    index++;
                }else {
                    break;
                }
            }
        }

        if(stack.isEmpty()) System.out.print(stringBuilder);
        else System.out.print("NO");

    }
}
