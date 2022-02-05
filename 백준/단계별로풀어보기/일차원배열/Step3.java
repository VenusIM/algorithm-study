package Algorithms.백준.단계별로풀어보기.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2577 제목 숫자의 개수
public class Step3 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int result = 1;
        for(int i = 0; i < 3; i++) {
            result *= Integer.parseInt(bufferedReader.readLine());
        }
        String str = Integer.toString(result);

        int[] counts = new int[10];
        for(int j = 0; j < 10; j++) {
            for(int k = 0; k < str.length(); k ++) {
                if( Integer.parseInt(Character.toString(str.charAt(k))) == j) {
                    counts[j] = counts[j] + 1;
                }
            }
        }

        for(int num : counts) {
            System.out.println(num);
        }

    }
}
