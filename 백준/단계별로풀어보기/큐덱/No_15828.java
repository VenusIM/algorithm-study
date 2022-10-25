package 백준.단계별로풀어보기.큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int value;
        Queue<Integer> queue = new LinkedList<>();

        while(true) {
            value = Integer.parseInt(bufferedReader.readLine());
            switch (value) {
                case 0:
                    if(!queue.isEmpty()) {
                        queue.poll();
                    }
                    break;
                case -1:
                    bufferedReader.close();
                    if(queue.isEmpty()) {
                        System.out.print("empty");
                    }else {
                        StringBuilder stringBuilder = new StringBuilder();
                        while(!queue.isEmpty()) {
                            stringBuilder.append(queue.poll()).append(" ");
                        }
                        System.out.print(stringBuilder);
                    }
                    return;
                default:
                    if(queue.size() < N) {
                        queue.add(value);
                    }
                    break;
            }
        }
    }
}
