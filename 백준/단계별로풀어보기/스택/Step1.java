package Algorithms.백준.단계별로풀어보기.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 10828 스택
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bufferedReader.readLine());

        Stack<Integer> stack = new Stack<Integer>();
        String command;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < count; i++) {

            int temp = 0;
            command = bufferedReader.readLine();
            if(command.contains("push")) {
                temp = Integer.parseInt(command.split(" ")[1]);
                command = "push";
            }

            switch (command) {
                case "top":
                    stringBuilder.append(stack.empty() ? -1 : stack.peek()).append("\n");
                    break;
                case "size":
                    stringBuilder.append(stack.size()).append("\n");
                    break;
                case "empty":
                    stringBuilder.append(stack.empty() ? 1 : 0).append("\n");
                    break;
                case "pop":
                    stringBuilder.append(stack.empty() ? -1 : stack.pop()).append("\n");
                    break;
                default:
                    stack.push(temp);
                    break;
            }
        }

        System.out.print(stringBuilder);

    }
}
