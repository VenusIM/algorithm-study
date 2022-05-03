package Algorithms.백준.단계별로풀어보기.반복문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 10951 A+B-4
public class No_10951 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String str;

        while ((str = bufferedReader.readLine()) != null) {

            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;

            stringBuilder.append(a+b).append("\n");

        }
        System.out.println(stringBuilder);
    }
}
