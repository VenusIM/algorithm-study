package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Step6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        String[] strs = bufferedReader.readLine().split(" ");
        int[] nums = new int[N];

        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

        Stack<Integer> stack = new Stack<Integer>();
        int tmp = 0;
        for(int i = N - 1; i >= 0; i--) {
            // 마지막은 무조건 -1
            if(i == N-1) {
                stack.push(-1);
                tmp = i;
            }
            else if(nums[i] < nums[tmp]){
                for(int j = i+1; j <= tmp; j++){
                    if(nums[i] < nums[j]) stack.push(nums[j]);
                }
            }else {
                stack.push(-1);
                tmp = i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.empty()) {
            stringBuilder.append(stack.pop()).append(" ");
        }

        System.out.print(stringBuilder);
    }
}
