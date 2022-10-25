package 백준.단계별로풀어보기.큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NO_18258 {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int back = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    back = x;
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        stringBuilder.append(-1).append("\n");
                    } else {
                        stringBuilder.append(queue.poll()).append("\n");
                    }
                    break;

                case "size":
                    stringBuilder.append(queue.size()).append("\n");
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        stringBuilder.append(1).append("\n");
                    } else {
                        stringBuilder.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        stringBuilder.append(-1).append("\n");
                    } else {
                        stringBuilder.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        stringBuilder.append(-1).append("\n");
                    } else {
                        stringBuilder.append(back).append("\n");
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.print(stringBuilder);
    }
}

