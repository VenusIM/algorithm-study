package Algorithms.프로그래머스.Lv2.팁스타운2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 예상대진표 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(bufferedReader.readLine());
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        System.out.print(Solution(n,a,b));
    }
    static int Solution(int n, int a, int b) {

        if(Math.max(a,b)%2 == 0 && Math.abs(a-b) == 1) return 1;

        int left = a;
        int right = b;

        if(a > b) {
            left = b;
            right = a;
        }

        int count = 1;
        while(true) {
            if(right % 2 == 0 && right - left == 1) break;
            left = (left + 1) / 2;
            right = (right + 1) / 2;
            count ++;
        }

        return count;
    }
}
