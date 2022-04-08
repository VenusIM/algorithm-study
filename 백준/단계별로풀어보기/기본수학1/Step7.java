package Algorithms.백준.단계별로풀어보기.기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2839번 설탕배달
public class Step7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        if((num - 5) % 3 == 0) {
            System.out.print((num - 5)/3 + 1);
        } else if((num - 3) % 5 == 0) {
            System.out.print((num - 3)/5 + 1);
        } else if(num % 3 == 0) {

        } else if(num % 5 == 0) {

        }

    }

}
