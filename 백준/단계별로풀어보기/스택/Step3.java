package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 9012번 괄호
public class Step3 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        String[] strs;
        Stack<Integer> stack = new Stack<Integer>();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {

            strs = bufferedReader.readLine().split("");

            // 처음부터 ")"이 들어 온다면 NO를 삽입하고 다음 줄을 실행.
            if(strs[0].equals(")")) {
                stringBuilder.append("NO").append("\n");
                continue;
            }

            boolean flag = false;

            for(int j = 0; j < strs.length; j++) {

                if(stack.empty() && strs[j].equals(")") ){
                    stringBuilder.append("NO").append("\n");
                    flag = true;
                    break;
                }

                switch (strs[j]) {
                    case "(" :
                        stack.push(1);
                        break;
                    case ")" :
                        stack.pop();
                        break;
                }
            }

            if(flag) {
                flag = false;
                stack.clear();
                continue;
            }

            if(stack.empty()) stringBuilder.append("YES").append("\n");
            else stringBuilder.append("NO").append("\n");
            stack.clear();
        }

        System.out.print(stringBuilder);
    }
}
