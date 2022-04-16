package Algorithms.백준.단계별로풀어보기.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11729 하노이탑이동순서
public class Step4 {
    static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        stringBuilder.append((int)(Math.pow(2,n)-1)).append("\n");

        makeHanoi(n,1,2,3);
        System.out.print(stringBuilder);
    }

    static void makeHanoi(int n, int start, int middle, int end) {
        if(n == 1) {
            stringBuilder
                    .append(start)
                    .append(" ")
                    .append(end)
                    .append("\n");
            return;
        }

        // start에서 middle로 n-1개 이동
        makeHanoi(n-1, start, end, middle);

        // start에서 end로 n을 이동
        stringBuilder.append(start).append(" ").append(end).append("\n");

        // middle에서 end로 n-1개를 이동
        makeHanoi(n-1, middle, start, end);
    }
}
