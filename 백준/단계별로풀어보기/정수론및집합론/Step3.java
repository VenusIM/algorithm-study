package Algorithms.백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2609 최대공약수와 최소공배수
public class Step3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int numA = Integer.parseInt(stringTokenizer.nextToken());
        int numB = Integer.parseInt(stringTokenizer.nextToken());

        int min = (numA < numB) ? numA : numB;
        int gcd = 0; for (int i = 1; i <= min; i++) {
            if (numA % i == 0 && numB % i == 0) gcd = i;
        }
        System.out.println(gcd);
        System.out.println(numA * numB / gcd);
    }
}
