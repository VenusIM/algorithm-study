package Algorithms.백준.단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 10809 문제 알파벳 찾기
public class No_10809 {
    public static void main(String[] args) throws Exception{
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] str = bufferedReader.readLine().toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < alphabet.length; i++) {
            for(int j = 0; j < str.length; j++) {
                if(alphabet[i] == str[j]) {
                    stringBuilder.append(j).append(" ");
                    break;
                }
                if(j == str.length -1) {
                    stringBuilder.append("-1 ");
                }
            }
        }
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" ")));
    }
}
