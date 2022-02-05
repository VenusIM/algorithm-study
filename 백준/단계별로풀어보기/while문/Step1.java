package Algorithms.백준.단계별로풀어보기.while문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 10952 문제 A+B-5
public class Step1 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] ab;
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {

            ab = bufferedReader.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            if(a == 0 && b == 0) {
                break;
            }

            stringBuilder.append(a+b).append("\n");
        }

        System.out.print(stringBuilder);

    }
}
