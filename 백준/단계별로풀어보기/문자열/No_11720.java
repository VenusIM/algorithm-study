package Algorithms.백준.단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 11720 문제 숫자의 합
public class No_11720 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        String str = bufferedReader.readLine();
        int num = 0;

        for(int i = 0; i < count; i++) {
            num += Integer.parseInt(Character.toString(str.charAt(i)));
        }
        System.out.println(num);
    }
}
