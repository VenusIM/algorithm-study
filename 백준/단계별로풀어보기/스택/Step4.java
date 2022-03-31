package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<Integer>();

        String tmp;
        StringBuilder stringBuilder = new StringBuilder();

        while((tmp = bufferedReader.readLine()) != null) {

            if(tmp.equals(".")) break;

            boolean flag = false;

            for(int i = 0; i < tmp.length(); i++) {
                char ch = tmp.charAt(i);
                switch (ch) {
                    case '(':
                        stack.push(1);
                        break;
                    case ')':
                        if(!stack.empty() && stack.peek() == 1) stack.pop();
                        else flag = true;
                        break;
                    case '[':
                        stack.push(2);
                        break;
                    case ']':
                        if(!stack.empty() && stack.peek() == 2) stack.pop();
                        else flag = true;
                        break;
                }
            }
            stringBuilder.append(Step4.yesORno(stack, flag)).append("\n");
            stack.clear();

        }
        System.out.print(stringBuilder);
    }

    static String yesORno(Stack stack, boolean flag) {
        String result = "no";
        if(stack.empty() && !flag) {
            result = "yes";
        }
        return result;
    }
}
