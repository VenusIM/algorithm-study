package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1085q번 직사각형에서 탈출
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());
        int w = Integer.parseInt(stringTokenizer.nextToken());
        int h = Integer.parseInt(stringTokenizer.nextToken());

        //(x,0)까지의 거리
        int result = x;

        //(0,y)까지의 거리리
        if(y < result) result = y;

        //(w,0)까지의 거리
        if(w-x < result) result = w-x;

        //(0,h)까지의 거리
        if(h-y < result) result = h-y;

        System.out.print(result);

    }
}
