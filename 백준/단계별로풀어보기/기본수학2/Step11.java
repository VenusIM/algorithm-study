package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1002 터렛
public class Step11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int r1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int r2 = Integer.parseInt(stringTokenizer.nextToken());

            int pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	// 좌표간의 거리

            // 중점, 반지름 모두 같을 경우
            if(x1 == x2 && y1 == y2 && r1 == r2) stringBuilder.append(-1);

            //반지름 합보다 더 길 때, 내접하지 않을 때
            else if(pow > Math.pow(r1 + r2, 2) || pow < Math.pow(r2 - r1, 2))
                stringBuilder.append(0);

            //내접할 때, 외접할 때
            else if(pow == Math.pow(r2 - r1, 2) || pow == Math.pow(r1 + r2, 2))
                stringBuilder.append(1);

            else stringBuilder.append(2);

            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
