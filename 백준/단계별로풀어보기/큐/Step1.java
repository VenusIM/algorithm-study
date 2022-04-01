package Algorithms.백준.단계별로풀어보기.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 18258번 큐2
public class Step1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        String command;
        int value = 0;
        int last = -1;


        for(int i = 0; i < count; i++) {

            command = bufferedReader.readLine();
            if(command.contains("push")) {
                value = Integer.parseInt(command.split(" ")[1]);
                command = "push";
                last = value;
            }

            switch (command) {
                case "front" :
                    if(!queue.isEmpty()) stringBuilder.append(queue.peek());
                    else stringBuilder.append(-1);
                    stringBuilder.append("\n");
                    break;
                case "back" :
                    if(!queue.isEmpty()) stringBuilder.append(last);
                    else stringBuilder.append(-1);
                    stringBuilder.append("\n");
                    break;
                case "size" :
                    stringBuilder.append(queue.size()).append("\n");
                    break;
                case "pop" :
                    if(!queue.isEmpty()) stringBuilder.append(queue.poll());
                    else stringBuilder.append(-1);
                    stringBuilder.append("\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()) stringBuilder.append(1);
                    else stringBuilder.append(0);
                    stringBuilder.append("\n");
                    break;
                default :
                    queue.offer(value);
            }

        }
        System.out.print(stringBuilder.deleteCharAt(stringBuilder.lastIndexOf("\n")));
    }
}
