package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 10773번 제로
public class Step2 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());

        Stack<Integer> stack = new Stack<Integer>();
        int temp = 0;

        for(int i = 0; i < K; i++) {
            temp = Integer.parseInt(bufferedReader.readLine());
            if(temp == 0 && stack.size() != 0) {
                stack.pop();
            }else {
                stack.push(temp);
            }
        }

        int result = 0;
        while(!stack.empty()) {
            result += stack.pop();
        }

        System.out.print(result);
    }
}
