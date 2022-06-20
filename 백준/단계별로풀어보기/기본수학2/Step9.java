package Algorithms.백준.단계별로풀어보기.기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//4153 직각삼각형
public class Step9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        while(true) {
            String triangle = bufferedReader.readLine();
            if(triangle.equals("0 0 0")) break;
            StringTokenizer stringTokenizer = new StringTokenizer(triangle);
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());


            if(a*a == b*b + c*c) stringBuilder.append("right");
            else if(b*b == a*a + c*c) stringBuilder.append("right");
            else if(c*c == a*a + b*b) stringBuilder.append("right");
            else stringBuilder.append("wrong");

            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
