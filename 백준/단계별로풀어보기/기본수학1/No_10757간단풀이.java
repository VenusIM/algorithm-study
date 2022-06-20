package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// 10757 큰수 A+B
public class No_10757간단풀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        BigInteger A = new BigInteger(stringTokenizer.nextToken());
        BigInteger B = new BigInteger(stringTokenizer.nextToken());

        A = A.add(B);

        System.out.print(A.toString());
    }
}
