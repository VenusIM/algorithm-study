package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2839번 설탕배달
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int five = N;
        int three = N;
        int count = 0;
        int result = 0;

        while(0 <= five) {
            if(five % 5 == 0) {
                if(result == 0) result = five/5 + count;
                else if(five/5 + count < result) result = five/5 + count;
            }
            five -= 3;
            count ++;
        }

        count = 0;

        while (0 <= three) {
            if(three % 3 == 0) {
                if(result == 0) result = three/3 + count;
                else if(three/3 + count < result) result = three/3 + count;
            }
            three -= 5;
            count ++;
        }

        switch (result) {
            case 0 :
                System.out.print(-1);
                break;
            default:
                System.out.print(result);
        }
    }
}
