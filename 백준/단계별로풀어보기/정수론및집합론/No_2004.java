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

        int result = 0;
        for(int i = max; i > min; i--) {
            if(i % 5 == 0) {
                result += count5(i, 0);
            }
        }

        for(int i = 5; i <= min; i++) {
            if(i % 5 == 0) {
                result -= count5(i, 0);
            }
        }

        System.out.print(result);
    }

    static int count5(int num, int result) {
        if(num < 5) {
            return result;
        }
        return count5(num/5, ++result);
    }
}
