package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step6_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        // 문자를 배열 각 인덱스에 저장
        for(int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(stringTokenizer.nextToken()));
        }

        while(!stack.isEmpty()) {
            int value = stack.pop();
        }


    }
}
