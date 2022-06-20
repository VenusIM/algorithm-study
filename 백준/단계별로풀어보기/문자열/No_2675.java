package Algorithms.백준.단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2675 문제 문자열 반복
public class No_2675 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        char [] str;
        for(int i = 0; i < count; i++) {
            str = bufferedReader.readLine().toCharArray();
            for(int j = 2; j < str.length; j++) {
                int repeat = Integer.parseInt(String.valueOf(str[0]));
                for(int k = 0; k < repeat; k++) {
                    stringBuilder.append(str[j]);
                }
            }
            if(i < count-1)
                stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}
