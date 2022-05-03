package Algorithms.백준.단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1157 문제 단어 공부
public class No_1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] str = bufferedReader.readLine().toCharArray();

        int[] counts = new int[26];

        for (int i = 65; i < 91; i++) {
            for (int j = 0; j < str.length; j++) {
                int hash = (int) str[j];
                if(hash > 90) {
                    hash -= 32;
                }
                if (hash == i) {
                    counts[i-65]++;
                }
            }
        }

        int resultCode = 0;
        int tmp = 0;
        for(int i = 65; i < 91; i++) {
            if(tmp < counts[i-65]){
                tmp = counts[i-65];
                resultCode = i;
            }
        }

        for(int i = 65; i < 91; i++) {
            if(counts[resultCode-65] == counts[i-65]) {
                if (i == resultCode) {
                    continue;
                }
                System.out.print("?");
                return;
            }
        }
        System.out.print((char) (resultCode));
    }
}
