package 백준.단계별로풀어보기.정수론및집합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int max = Integer.parseInt(stringTokenizer.nextToken());
        int min = Integer.parseInt(stringTokenizer.nextToken());

        int result2 = count2(max) - count2(min) - count2(max-min);
        int result5 = count5(max) - count5(min) - count5(max-min);

        System.out.print(Math.min(result2, result5));

    }

    public static int count5(int num) {
        int temp = 0;
        if (num < 5) return 0;
        for (int i = 5; i <= num; i *= 5) {
            temp += (num/i);
        }
        return temp;
    }

    public static int count2(int num) {
        int temp = 0;
        if (num < 2) return 0;
        for (int i = 2; i <= num; i *= 2) {
            temp += (num/i);
        }
        return temp;
    }
}
