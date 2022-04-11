package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 17298 오큰수
public class Step6_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // Index를 활용하기 위해 배열형태로 변경
        int[] nums = new int[N];
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            // 스택이 비어있지 않을 경우 스택에서 뽑은 값보다 크다면 해당 인덱스 값으로 변경
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                nums[stack.pop()] = nums[i];
            }
            // 위의 조건에 만족하지 않을 경우 작은 값이므로 스택에 쌓는다.
            stack.push(i);
        }

        // 스택이 비어 있지 않다면 오큰수가 존재하지 않는 것이므로
        while(!stack.isEmpty()) {
            nums[stack.pop()] = -1;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < N; i++) {
            stringBuilder.append(nums[i]);
            if(i < N - 1) stringBuilder.append(" ");
        }

        System.out.print(stringBuilder);
    }
}
