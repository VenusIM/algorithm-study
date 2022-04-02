package Algorithms.백준.단계별로풀어보기.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Step3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        List<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < N; i++) {
            queue.add(i+1);
        }

        StringBuilder stringBuilder = new StringBuilder().append("<");

        int index = -1;
        for(int i = 0; ; i++) {

            index = (index + K) % queue.size();
            stringBuilder.append(queue.remove(index));
            index--;
            if(i == N - 1) {
                stringBuilder.append(">");
                break;
            }
            stringBuilder.append(", ");
        }
        System.out.print(stringBuilder);
    }

}
