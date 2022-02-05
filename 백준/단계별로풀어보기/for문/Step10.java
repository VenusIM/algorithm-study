package Algorithms.백준.단계별로풀어보기.for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2439 문제 별찍기-2
public class Step10 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = count; 0 < i; i--) {

            for(int j = i-1; 0 < j; j-- ) {
                System.out.print(" ");
            }

            for(int k = count-i+1; 0 < k; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
