package Algorithms.백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//5086 배수와 약수
public class Step1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer;
        int numA;
        int numB;

        StringBuilder stringBuilder = new StringBuilder();
        while(true) {

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            numA = Integer.parseInt(stringTokenizer.nextToken());
            numB = Integer.parseInt(stringTokenizer.nextToken());

            if(numA == 0 && numB == 0) break;

            if(numA < numB && numB%numA == 0) stringBuilder.append("factor");
            else if (numB < numA && numA%numB == 0) stringBuilder.append("multiple");
            else stringBuilder.append("neither");

            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
