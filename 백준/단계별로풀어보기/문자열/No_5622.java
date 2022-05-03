package Algorithms.백준.단계별로풀어보기.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 5622 문제 다이얼
public class No_5622 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        int total = 0;
        char[] chars = str.toCharArray();
        for(char ch : chars) {

             switch (ch) {
                 case 'A': case 'B': case 'C':
                     total += 3;
                     break;
                 case 'D': case 'E': case 'F':
                     total += 4;
                     break;
                 case 'G': case 'H': case 'I':
                     total += 5;
                     break;
                 case 'J': case 'K': case 'L':
                     total += 6;
                     break;
                 case 'N': case 'M': case 'O':
                     total += 7;
                     break;
                 case 'P': case 'Q': case 'R': case 'S':
                     total += 8;
                     break;
                 case 'T': case 'U': case 'V':
                     total += 9;
                     break;
                 case 'W': case 'X': case 'Y': case 'Z':
                     total += 10;
                     break;
             }

        }
        System.out.print(total);
    }
}
