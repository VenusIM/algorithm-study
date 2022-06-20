package Algorithms.백준.단계별로풀어보기.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Step5 {
    public static void main(String[] ars) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        String command;
        int value = 0;
        for(int i = 0; i < N; i++) {

            command = bufferedReader.readLine();
            int tmp = command.length();

            if(command.contains("push_front")) {
                value = Integer.parseInt(command.substring(11,tmp));
                command = "push_front";
            }
            if(command.contains("push_back")) {
                value = Integer.parseInt(command.substring(10,tmp));
                command = "push_back";
            }

            switch (command) {
                case "push_front" :
                    deque.addFirst(value);
                    break;
                case "push_back" :
                    deque.addLast(value);
                    break;
                case "pop_front" :
                    if(deque.isEmpty()) stringBuilder.append(-1);
                    else stringBuilder.append(deque.pollFirst());
                    stringBuilder.append("\n");
                    break;
                case "pop_back" :
                    if(deque.isEmpty()) stringBuilder.append(-1);
                    else stringBuilder.append(deque.pollLast());
                    stringBuilder.append("\n");
                    break;
                case "front" :
                    if(deque.isEmpty()) stringBuilder.append(-1);
                    else stringBuilder.append(deque.getFirst());
                    stringBuilder.append("\n");
                    break;
                case "back" :
                    if(deque.isEmpty()) stringBuilder.append(-1);
                    else stringBuilder.append(deque.getLast());
                    stringBuilder.append("\n");
                    break;
                case "size" :
                    stringBuilder.append(deque.size()).append("\n");
                    break;
                case "empty" :
                    if(deque.isEmpty()) stringBuilder.append(1);
                    else stringBuilder.append(0);
                    stringBuilder.append("\n");
                    break;
            }
        }
        System.out.print(stringBuilder);
    }
}
